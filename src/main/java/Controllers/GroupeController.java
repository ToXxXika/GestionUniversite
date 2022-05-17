package Controllers;

import Database.DbConnection;
import Interfaces.GroupeInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class GroupeController extends DbConnection implements GroupeInterface {
    Connection Con = Connect();
     UserController userController = new UserController();

    @Override
    public boolean ajouterGroupe(String codeEtudiant, String nomGroupe) {
        boolean isAdded = false;
        //verify if the user is in the database
        if(userController.verifEtudiant(codeEtudiant)){
            String query = "INSERT INTO groupe(nomgrp, codeE) VALUES(?,?)";
            try {
                PreparedStatement pst = Con.prepareStatement(query);
                pst.setString(1, nomGroupe);
                pst.setString(2, codeEtudiant);
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    isAdded = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isAdded;
    }

    @Override
    public boolean supprimerEtd(String codeEtudiant) {
        boolean isDeleted = false;
        String query = "DELETE FROM groupe WHERE codeE = ?";
        try {
            PreparedStatement pst = Con.prepareStatement(query);
            pst.setString(1, codeEtudiant);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                isDeleted = true;
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return isDeleted;
    }
}
