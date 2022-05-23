package Models;

public class Absences {

    private String idEtudiant;
    private String Matiere ;
    private int nbAbsences;

    public Absences() {
    }

    public Absences(String idEtudiant, String matiere, int nbAbsences) {

        this.idEtudiant = idEtudiant;
        Matiere = matiere;
        this.nbAbsences = nbAbsences;
    }




    public String getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(String idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getMatiere() {
        return Matiere;
    }

    public void setMatiere(String matiere) {
        Matiere = matiere;
    }

    public int getNbAbsences() {
        return nbAbsences;
    }

    public void setNbAbsences(int nbAbsences) {
        this.nbAbsences = nbAbsences;
    }
}
