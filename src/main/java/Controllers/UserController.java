package Controllers;

import Database.DbConnection;
import Interfaces.UtilisateurInterface;
import Models.Enseignants;
import Models.Etudiants;
import Models.Personne;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

public class UserController extends DbConnection implements UtilisateurInterface {

    Connection Con = Connect();
    @Override
    public boolean Login(String Mail, String password) {
        boolean Res = false;
            String sql = "SELECT * from login where mail= ? and password = ?";

            try{
                PreparedStatement Ps =  Con.prepareStatement(sql);
                Ps.setString(1,Mail);
                Ps.setString(2,password);
                ResultSet Rs = Ps.executeQuery();
                if(Rs.next()){
                    System.out.println("Utilisateur Trouvé dans la base de donnée");
                     String sql2 ="SELECT * from personne where mail = ?";
                     try {
                         PreparedStatement PS = Con.prepareStatement(sql2);
                         PS.setString(1,Mail);
                         ResultSet Rs2 = PS.executeQuery();
                         if(Rs2.next()){
                             Thread MailStore= new Thread(Mail);
                             Thread PrenomStore= new Thread(Rs2.getString(2));
                             Thread NomStore= new Thread(Rs2.getString(4));
                             MailStore.start();
                             PrenomStore.start();
                             NomStore.start();
                             //TODO:  just for Test
                             System.out.println(MailStore.getName());
                             System.out.println(PrenomStore.getName());
                             System.out.println(NomStore.getName());
                             //TODO : Router by using Role

                         }
                     }catch (SQLException S){
                         System.out.println(S.getMessage());
                     }
                    Res = true ;
                }
            }catch (SQLException E){
                System.out.println(E.getMessage());
            }

       return Res ;
    }

    @Override
    public boolean SignIn(Personne P,int NumInsc,int cnss) {
        boolean Res = false ;
        String Sql = "Insert into personne(cin,nom,prenom,mail,password,role) values (?,?,?,?,?,?)";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1,P.getCin());
            Ps.setString(2, P.getNom());
            Ps.setString(3, P.getPrenom());
            Ps.setString(4, P.getMail());
            Ps.setString(5, P.getPassword());
            Ps.setString(6,P.getRole());

            int i = Ps.executeUpdate();
            if (i > 0) {
                switch (P.getRole()) {
                    case "Etudiant" : {
                        Etudiants E = new Etudiants();
                        E.setNom(P.getNom());
                        E.setPrenom(P.getPrenom());
                        E.setCin(P.getCin());
                        E.setNumInsc(NumInsc);
                        E.setMail(P.getMail());
                        E.setPassword(P.getPassword());
                        EtudiantSign(E);
                        Res = true ;
                        break;

                    } case "Enseignant" : {
                        Enseignants E = new Enseignants();
                        E.setCnss(cnss);
                        EnseignantSign(E);;
                        Res = true ;

                    }
                    default :System.out.println("Role non associée");
                }
            }
        }catch (Exception Ex){
            System.out.println(Ex.getMessage());
        }


        return Res;
    }

    @Override
    public boolean EtudiantSign(Etudiants E) {
        boolean Res = false ;
        String Sql = "Insert into etudiant(cin,numinsc) values (?,?)";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1, E.getCin());
            System.out.println("Cin Etudiant"+E.getCin());
            Ps.setInt(2, E.getNumInsc());
            int i = Ps.executeUpdate();
            if (i > 0) {
                String InsertLog = "Insert into login (mail,password) values(?,?)";
                PreparedStatement Ps2 = Con.prepareStatement(InsertLog);
                System.out.println("Mail Etudiant"+E.getMail());
                Ps2.setString(1, E.getMail());
                Ps2.setString(2, E.getPassword());
                int j = Ps2.executeUpdate();
                if (j > 0) {
                    //TODO: SEND MAIL TO THE SPECIFIC USER
                    CreateQrCode(E.getMail()+":"+E.getPassword(),E.getNom()+""+E.getPrenom(),E.getMail(),E.getPassword());
                    System.out.println("Etudiant Inscrit");
                    Res = true ;
                }
            }
        } catch (Exception EX) {
            System.out.println(EX.getMessage());
        }
        return Res;
    }
    public static void CreateQrCode(String  NomPrenom , String nameProd,String mail,String Password)throws WriterException, IOException {
        try {
            String qrCodeText = NomPrenom;
            System.out.println(qrCodeText);
            String filePath = nameProd + ".jpg";
            int size = 250;
            String fileType = "jpg";
            File qrFile = new File(filePath);
            createQrImage(qrFile, qrCodeText, size, fileType, mail,Password);
            System.out.println("DONE");
        } catch (IOException E) {
            System.out.println(E.getMessage());
        }
    }
    public static void createQrImage(File qrFile, String qrCodeText, int size, String fileType, String mail,String Password)throws WriterException, IOException {
        try {
            Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.L);
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix byteMatrix = qrCodeWriter.encode(qrCodeText, BarcodeFormat.QR_CODE,size,size,hintMap);
            int matrixWidth = byteMatrix.getWidth();
            BufferedImage image =  new BufferedImage(matrixWidth,matrixWidth,BufferedImage.TYPE_INT_RGB);
            image.createGraphics();
            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.white);
            graphics.fillRect(0,0,matrixWidth,matrixWidth);
            graphics.setColor(Color.BLACK);
            for (int i = 0; i < matrixWidth; i++) {
                for (int j = 0; j < matrixWidth; j++) {
                    if (byteMatrix.get(i, j)) {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }
            ImageIO.write(image, fileType, qrFile);

           SendMail(mail,Password,qrFile);
        }catch (Exception E ){
            System.out.println(E.getMessage());
        }
    }
    @Override
    public boolean EnseignantSign(Enseignants E) {
        boolean Res = false ;
        String Sql2 = "Insert into enseignant(cin,cnss) values (?,?)";
        try {
            PreparedStatement SS = Con.prepareStatement(Sql2);
            SS.setString(1, E.getCin());
            SS.setInt(2, E.getCnss());
            int i2 = SS.executeUpdate();
            if (i2 > 0) {
                String InsertLog = "Insert into login (mail,password) values(?,?)";
                PreparedStatement Ps2 = Con.prepareStatement(InsertLog);
                Ps2.setString(1, E.getMail());
                Ps2.setString(2, E.getPassword());
                int j = Ps2.executeUpdate();
                if (j > 0) {

                    Res = true ;
                    System.out.println("Enseignant Inscrit");
                }

            }

        } catch (Exception Ex) {
            System.out.println(Ex.getMessage());
        }
        return Res;
    }


    public static void SendMail(String mail,String Password,File file) {
        final String username ="infogames.trtn";
        final String password ="Freefallaga123";
        String from ="infogames.trtn@gmail.com";
        String to = mail ;
        String host = "localhost";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
                MimeMessage message = new MimeMessage(session);
            Multipart multipart = new MimeMultipart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent("<h1>Bienvenue sur notre site</h1><br><br>Votre Mail est :"+mail+" Votre mot de passe est : "+Password+"<br><br>Vous pouvez vous connecter avec ce mot de passe et changer votre mot de passe dans votre profil", "text/html");
            messageBodyPart.attachFile(file);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Bienvenue sur notre site");

            Transport.send(message);
            System.out.println("Mail envoyé");
    }catch (Exception e){
        System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean verifEtudiant(String cin) {
        boolean Res = false ;
        String Sql = "Select * from etudiant where cin = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1, cin);
            ResultSet Rs = Ps.executeQuery();
            if (Rs.next()) {
                Res = true ;
            }
        }catch (Exception Ex){
            System.out.println(Ex.getMessage());
        }
        return Res;
    }

    @Override
    public String getPersonneByRole(String mail) {
        String Res = "";
        String Sql = "Select * from personne where mail = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1, mail);
            ResultSet Rs = Ps.executeQuery();
            if (Rs.next()) {
                Res = Rs.getString("role");
            }
        }catch (Exception Ex){
            System.out.println(Ex.getMessage());
        }
        return Res;
    }

    @Override
    public List<Personne> getAllPersonne() {
        ArrayList<Personne> Res = new ArrayList<>();
        String Sql = "Select * from personne";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            ResultSet Rs = Ps.executeQuery();
            while (Rs.next()) {
                Personne P = new Personne();
                P.setCin(Rs.getString("cin"));
                P.setNom(Rs.getString("nom"));
                P.setPrenom(Rs.getString("prenom"));
                P.setMail(Rs.getString("mail"));
                P.setRole(Rs.getString("role"));
                Res.add(P);
            }
        }catch (Exception Ex){
            System.out.println(Ex.getMessage());

        }
        return Res;

    }

    @Override
    public boolean DeleteEtudiant(String cin) {
        String sql = "Delete from etudiant where cin = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(sql);
            Ps.setString(1, cin);
            int Res = Ps.executeUpdate();
            if (Res > 0) {
                return true;

            }

        }catch (Exception Ex){
            System.out.println(Ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean DeleteEnseignant(String Cin) {
        String sql ="Delete from enseignant where cin = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(sql);
            Ps.setString(1, Cin);
            int Res = Ps.executeUpdate();
            if (Res > 0) {
                return true;

            }
        } catch (Exception Ex){
            System.out.println(Ex.getMessage());

        }
        return false;

    }

    @Override
    public boolean DeletePersonne(String Cin) {
        boolean Res = false ;
        System.out.println("in function DeletePersonne");
        if(DeleteEtudiant(Cin)) {
            System.out.println("Deleted from Etudiant");
            String Sql = "Delete from personne where cin = ?";
            try {
                PreparedStatement Ps = Con.prepareStatement(Sql);
                Ps.setString(1, Cin);
                int i = Ps.executeUpdate();
                if (i > 0) {
                    System.out.println("Deleted from Personne");
                    Res = true;
                }
            } catch (Exception Ex) {
                System.out.println(Ex.getMessage());
            }
        }else{
            System.out.println("Erreur dans la suppression de l'etudiant ");
            Res= false;
        }
        return Res;
    }

    @Override
    public Personne VerifEtudiant(int NumInsc) {
        System.out.println("in function VerifEtudiant");
        String Sql = "Select * from etudiant where numinsc = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setInt(1, NumInsc);
            ResultSet Rs = Ps.executeQuery();
            if (Rs.next()) {
                System.out.println("Etudiant existe");
               String sql2="Select * from personne where cin = ?";
                try {
                    PreparedStatement Ps2 = Con.prepareStatement(sql2);
                    Ps2.setString(1, Rs.getString("cin"));
                    ResultSet Rs2 = Ps2.executeQuery();
                    if (Rs2.next()) {
                        System.out.println("Personne existe");
                        System.out.println("RS2 : " + Rs2.getString("cin"));
                        Personne P = new Personne();
                        P.setCin(Rs2.getString("cin"));
                        P.setNom(Rs2.getString("nom"));
                        P.setPrenom(Rs2.getString("prenom"));
                        return P;
                    }
                } catch (Exception Ex) {
                    System.out.println(Ex.getMessage());
                }
            }
        }catch (Exception Ex){
            System.out.println(Ex.getMessage());
        }
        return null;
    }
}

