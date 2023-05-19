package Controllers;

import Database.DbConnection;
import Interfaces.NoteInterface;
import Models.Matiere;
import Models.Moyenne;
import Models.Notes;
import Models.Personne;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.opencv.core.Mat;


import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NoteController extends DbConnection implements NoteInterface {

    Connection Con = Connect();

    //TODO:
    @Override
    public boolean AjouterNote(float N, String M, String type,String Nom, String Prenom) {
        boolean Res = false;
        MatiereController MC = new MatiereController();
        UserController UC = new UserController();
        List<Personne> LSP = UC.getAllPersonne();
        for(Personne P : LSP){
            if(P.getNom().equals(Nom) && P.getPrenom().equals(Prenom)){
                if(MC.getMatiere(M)!=null){
                    String Sql = "Insert into notes(matiere,typeN,cinE,note) values (?,?,?,?)";
                    try {
                        PreparedStatement Ps = Con.prepareStatement(Sql);
                        Ps.setInt(1, MC.getMatiere(M).getId());
                        Ps.setString(2,type);
                        Ps.setString(3,P.getCin());
                        Ps.setFloat(4,N);
                        int i = Ps.executeUpdate();
                        if (i > 0) {
                            Res = true;
                        }

                    } catch (SQLException E) {
                        System.out.println(E.getMessage());
                    }
                }
            }
        }


        return Res;
    }
    //TODO : fix this function to delete a note

    @Override
    public boolean deleteNote(int id, String Matiere) {
        boolean Res = false;
        MatiereController MC = new MatiereController();
        if(MC.getMatiere(Matiere)!=null){
            String Sql = "Delete from notes where cinE = ? and matiere = ?";
            try {
                PreparedStatement Ps = Con.prepareStatement(Sql);
                Ps.setInt(1, id);
                Ps.setInt(2, MC.getMatiere(Matiere).getId());
                int i = Ps.executeUpdate();
                if (i > 0) {
                    Res = true;
                }
            } catch (SQLException E) {
                System.out.println(E.getMessage());

            }
        }else{
            System.out.println("Matiere not found");
        }

        return Res;
    }




    @Override
    public boolean ModifyNote(Notes N, Matiere M, String Nom, String Prenom) {
           boolean Res = false ;
           String sql = "Update notes set  note = ?where nom = ? and prenom = ? and matiere = ?";
           try{
               PreparedStatement ps = Con.prepareStatement(sql);
               ps.setString(4, M.getNom());
               ps.setFloat(1, N.getNote());
               ps.setString(2, Nom);
               ps.setString(3, Prenom);
               int i = ps.executeUpdate();
               if(i > 0){
                   Res = true;
               }

           }catch (SQLException E){
               System.out.println(E.getMessage());
           }
          return Res ;
    }

    @Override
    public float getMoyenne(String codeE, String Matiere) {
        System.out.println("getMoyenne");
        float Res = 0;
        String Sql = "Select AVG(note) from notes where matiere = ? and cinE = ?";
        System.out.println(Sql);
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1, Matiere);
            Ps.setString(2, codeE);
            ResultSet Rs  = Ps.executeQuery();
            if (Rs.next()) {
                System.out.println("RS valid");
                System.out.println(Res);
                Res = Rs.getFloat(1);
            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return Res;
    }

    @Override
    public boolean SaveMoyenne(int NumInsc, String Nom, String Prenom, String Matiere, float Moyenne) {
        boolean Res = false;
        String Sql = "Insert into moyennelog(NumInsc,Nom,Prenom,Matiere,Moyenne) values (?,?,?,?,?)";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setInt(1, NumInsc);
            Ps.setString(2, Nom);
            Ps.setString(3, Prenom);
            Ps.setString(4, Matiere);
            Ps.setFloat(5, Moyenne);
            int i = Ps.executeUpdate();
            if (i > 0) {
                System.out.println("Moyenne saved");
                Res = true;
            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return Res;

    }

    @Override
    public List<Notes> getNoteByEtudiant(String codeE) {
        List<Notes> Res = new ArrayList<>();
        String Sql = "Select * from notes where cinE = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1, codeE);
            ResultSet Rs = Ps.executeQuery();
            while (Rs.next()) {
                Notes N = new Notes();
                 N.setCodeEtudiant(Rs.getString("cinE"));
                 N.setMatiere(Rs.getString("matiere"));
                 N.setNote(Rs.getFloat("note"));
                 N.setType(Rs.getString("typeN"));
                Res.add(N);
            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return Res;
    }



    @Override
    public List<Moyenne> getAllMoyenne() {
        System.out.println("getAllMoyenne");
        List<Moyenne> Res = new ArrayList<>();
        String Sql = "Select * from moyennelog";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            ResultSet Rs = Ps.executeQuery();
            while (Rs.next()) {
                Moyenne M = new Moyenne();
                M.setNumInsc(Rs.getInt("NumInsc"));
                M.setNom(Rs.getString("Nom"));
                M.setPrenom(Rs.getString("Prenom"));
                M.setMatiere(Rs.getString("Matiere"));
                M.setMoyenne(Rs.getFloat("Moyenne"));
                Res.add(M);
                System.out.println("Moyenne added");
            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return Res;
    }


}