package Interfaces;

import Models.Enseignants;
import Models.Etudiants;
import Models.Personne;

 public interface UtilisateurInterface {
     boolean Login(String user,String password);
     boolean SignIn(Personne P,int NumInsc,int cnss   );
     boolean EtudiantSign(Etudiants E);
     boolean EnseignantSign(Enseignants E);
     void SendMail(String mail,String Password);
     boolean verifEtudiant(String cin);


}


