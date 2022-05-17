import Controllers.UserController;
import Database.DbConnection;
import Models.Personne;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class mainC {
    public static void main(String[] args) {
        UserController userController = new UserController();
        //Test if login function works
        userController.Login("mabrouki552@gmail.com", "123");
        //declare a Personne variable and populate it with data
        Personne personne = new Personne();
        personne.setNom("Mabrouki");
        personne.setPrenom("Mohamed");
        personne.setMail("ikasou.666@gmail.com");
        personne.setPassword("123");
        personne.setCin("12345678");
        personne.setRole("Etudiant");
        userController.SignIn(personne, 123,0);


    }
}
