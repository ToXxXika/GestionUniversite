package Interfaces;

import Models.Enseignants;
import Models.Etudiants;
import Models.Personne;

import java.sql.ResultSet;
import java.util.List;

public interface UtilisateurInterface {
     boolean Login(String user,String password);
     boolean SignIn(Personne P,int NumInsc,int cnss   );
     boolean EtudiantSign(Etudiants E);
     boolean EnseignantSign(Enseignants E);
     boolean verifEtudiant(String cin);
     String getPersonneByRole(String mail);
     List<Personne> getAllPersonne();
     boolean DeleteEtudiant(String cin);
     boolean  DeleteEnseignant(String Cin);
     boolean DeletePersonne(String Cin);
     Personne VerifEtudiant(int NumInsc);






}


