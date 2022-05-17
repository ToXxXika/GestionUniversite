package Controllers;

import Database.DbConnection;
import Interfaces.AbsenceInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AbsenceController extends DbConnection implements AbsenceInterface {

    Connection Con  = Connect();

    @Override
    public boolean AjouterAbsence(int idEtudiant, String Matiere, int nbAbsences) {
        //verify if matiere is in the database
        // add Absence to the database
        boolean Res = false;
        String Sql = "Insert into absences(idEtudiant,matiere,nbAbsences) values (?,?,?)";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setInt(1, idEtudiant);
            Ps.setString(2, Matiere);
            Ps.setInt(3, nbAbsences);
            int i = Ps.executeUpdate();
            if (i > 0) {
                Res = true;
                System.out.println("Absence added");
            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return Res;
    }

    @Override
    public boolean deleteAbsence(int id) {
        boolean Res = false;
        String Sql = "Delete from absences where idAbsence = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setInt(1, id);
            int i = Ps.executeUpdate();
            if (i > 0) {
                Res = true;
                System.out.println("Absence deleted");
            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return Res;
    }

    @Override
    public int NbrAbsence(int idEtudiant, String Matiere) {
        int Res = 0;
        String Sql = "Select * from absencs where idEtudiant = ? and matiere = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setInt(1, idEtudiant);
            Ps.setString(2, Matiere);
            ResultSet Rs  = Ps.executeQuery();
               if (Rs.next()) {

                     Res = Rs.getInt("nbAbsences");

                }
        } catch (SQLException E) {
            System.out.println(E.getMessage());

        }
        return Res;
    }
}
