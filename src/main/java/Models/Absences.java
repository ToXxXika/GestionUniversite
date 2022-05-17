package Models;

public class Absences {

    private int idA;
    private int idEtudiant;
    private String Matiere ;
    private int nbAbsences;

    public Absences(int idA, int idEtudiant, String matiere, int nbAbsences) {
        this.idA = idA;
        this.idEtudiant = idEtudiant;
        Matiere = matiere;
        this.nbAbsences = nbAbsences;
    }

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
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
