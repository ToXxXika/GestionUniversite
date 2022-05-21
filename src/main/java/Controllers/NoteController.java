package Controllers;

import Database.DbConnection;
import Interfaces.NoteInterface;
import Models.Matiere;
import Models.Notes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NoteController extends DbConnection implements NoteInterface {

    Connection Con = Connect();

    //TODO:
    @Override
    public boolean AjouterNote(Notes N, Matiere M, String Nom, String Prenom) {
        boolean Res = false;
        String Sql = "Insert into notes(matiere,note,type,nom,prenom) values (?,?,?,?,?)";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1, M.getNom());
            Ps.setInt(2, N.getNote());
            Ps.setString(3, N.getType());
            Ps.setString(4, Nom);
            Ps.setString(5, Prenom);
            int i = Ps.executeUpdate();
            if (i > 0) {
                Res = true;
            }

        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return Res;
    }
    //TODO : fix this function to delete a note

    @Override
    public boolean deleteNote(int id) {
        boolean Res = false;
        String Sql = "Delete from notes where id = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setInt(1, id);
            int i = Ps.executeUpdate();
            if (i > 0) {
                Res = true;
            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());

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
               ps.setInt(1, N.getNote());
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
}