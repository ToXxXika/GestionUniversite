package Controllers;

import Database.DbConnection;
import Interfaces.MatiereInterface;
import Models.Matiere;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MatiereController extends DbConnection implements MatiereInterface {
    Connection con = Connect();
    @Override
    public boolean ajouterMatiere(String nom, String code, float coef) {

        boolean isAdded = false;
        String query = "INSERT INTO matiere(nom, code, coef) VALUES(?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nom);
            pst.setString(2, code);
            pst.setFloat(3, coef);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                isAdded = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAdded;
    }

    @Override
    public boolean supprimerMatiere(String code) {
        boolean isDeleted = false;
        String query = "DELETE FROM matiere WHERE code = ?";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, code);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                isDeleted = true;
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return isDeleted;
    }

    @Override
    public boolean modifierMatiere(String nom, float coef) {
        return false;
    }

    @Override
    public boolean verifierMatiere(String Nom) {
        boolean isExist = false;
        String query = "SELECT * FROM matiere WHERE nom = ?";
try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Nom);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                isExist = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
          return isExist;
    }

    @Override
    public Matiere getMatiere(String code) {
        Matiere matiere = null;
        String query = "SELECT * FROM matiere WHERE nomMat = ?";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, code);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                matiere = new Matiere(rs.getInt("idMat"), rs.getString("nomMat"), rs.getFloat("coefMat"));
            }
        } catch (Exception e) {
           System.out.println(e.getMessage()+"erreur");
        }
        return matiere;
    }

    @Override
    public Matiere getMatiereById(int id) {
        System.out.println("Matiere"+id);
        Matiere matiere = null;
        String query = "SELECT * FROM matiere WHERE idMat = ?";
        try {
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setInt(1, id);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            matiere = new Matiere(rs.getInt("idMat"), rs.getString("nomMat"), rs.getFloat("coefMat"));

                        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return matiere;
    }
}
