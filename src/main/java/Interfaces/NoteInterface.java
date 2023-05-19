package Interfaces;

import Models.Matiere;
import Models.Moyenne;
import Models.Notes;

import java.util.List;

public interface NoteInterface {

    boolean AjouterNote(float N, String M, String type,String Nom, String Prenom);
    boolean deleteNote(int id,String Matiere );
    //declare a function named ModifyNote without developing it
    boolean ModifyNote(Notes N,Matiere M ,String Nom, String Prenom);
    float getMoyenne(String codeE,String Matiere);
    boolean SaveMoyenne(int NumInsc,String Nom,String Prenom,String Matiere,float Moyenne);

    List<Notes> getNoteByEtudiant(String codeE);



    List<Moyenne> getAllMoyenne();

}
