package Interfaces;

import Models.Matiere;
import Models.Notes;

public interface NoteInterface {

    boolean AjouterNote(Notes N,Matiere M ,String Nom, String Prenom);
    boolean deleteNote(int id);
    //declare a function named ModifyNote without developing it
    boolean ModifyNote(Notes N,Matiere M ,String Nom, String Prenom);
    float getMoyenne(String codeE,String Matiere);
}
