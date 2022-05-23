package Models;

public class Notes {

    String Matiere ;
    float Note ;
    String type ;
    String codeEtudiant ;


    public String getCodeEtudiant() {
        return codeEtudiant;
    }

    public void setCodeEtudiant(String codeEtudiant) {
        this.codeEtudiant = codeEtudiant;
    }

    public Notes(String matiere, int note, String type) {
        Matiere = matiere;
        Note = note;
        this.type = type;
    }

    public Notes() {

    }

    public String getMatiere() {
        return Matiere;
    }

    public void setMatiere(String matiere) {
        Matiere = matiere;
    }

    public float getNote() {
        return Note;
    }

    public void setNote(float note) {
        Note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
