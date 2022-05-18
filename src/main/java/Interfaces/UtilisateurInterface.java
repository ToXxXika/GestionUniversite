package Interfaces;

import Models.Enseignants;
import Models.Etudiants;
import Models.Personne;

import java.io.File;

public interface UtilisateurInterface {
     boolean Login(String user,String password);
     boolean SignIn(Personne P,int NumInsc,int cnss   );
     boolean EtudiantSign(Etudiants E);
     boolean EnseignantSign(Enseignants E);
     boolean verifEtudiant(String cin);


}


