package Controllers;

import Database.DbConnection;
import Interfaces.AbsenceInterface;
import Models.Absences;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AbsenceController extends DbConnection implements AbsenceInterface {

    Connection Con = Connect();

    @Override
    public boolean AjouterAbsence(int idEtudiant, String Matiere, int nbAbsences) {
        //verify if matiere is in the database
        // add Absence to the database
        boolean Res = false;
        MatiereController MC = new MatiereController();
        if (MC.getMatiere(Matiere) != null) {
            String Sql = "Insert into absences(CinE,Matiere,nbrAbs) values (?,?,?)";
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
        }

        return Res;
    }

    @Override
    public boolean deleteAbsence(String CinE) {
        boolean Res = false;
        String Sql = "Delete from absences where CinE = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1, CinE);
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
            ResultSet Rs = Ps.executeQuery();
            if (Rs.next()) {

                Res = Rs.getInt("nbAbsences");

            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());

        }
        return Res;
    }

    @Override
    public List<Absences> getAbsenceByEtudiant(String cin) {
        System.out.println("hi");
        System.out.println(cin);
        List<Absences> LsA = new ArrayList<>();
        String Sql = "Select * from absences where CinE = ?";
        try {
            PreparedStatement Ps = Con.prepareStatement(Sql);
            Ps.setString(1, cin);
            ResultSet Rs = Ps.executeQuery();
            while (Rs.next()) {
                Absences A = new Absences();
                A.setIdEtudiant(Rs.getString("CinE"));
                MatiereController MC = new MatiereController();
                System.out.println("wselt lenna ");
                A.setMatiere(MC.getMatiereById(Rs.getInt("Matiere")).getNom());
                A.setNbAbsences(Rs.getInt("nbrAbs"));
                LsA.add(A);

            }
            System.out.println("Taille de Liste Absence " +LsA.size());
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return LsA;
    }
}
