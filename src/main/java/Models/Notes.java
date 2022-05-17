package Models;

public class Notes {

    Matiere Matiere ;
    int Note ;
    String type ;
    String codeEtudiant ;



    public Notes(Models.Matiere matiere, int note, String type) {
        Matiere = matiere;
        Note = note;
        this.type = type;
    }

    public Models.Matiere getMatiere() {
        return Matiere;
    }

    public void setMatiere(Models.Matiere matiere) {
        Matiere = matiere;
    }

    public int getNote() {
        return Note;
    }

    public void setNote(int note) {
        Note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
