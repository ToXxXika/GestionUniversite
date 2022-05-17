package Models;

public class Groupe {
    String codeEtudiant;
    String nomGroupe;

    public Groupe(String codeEtudiant, String nomGroupe) {
        this.codeEtudiant = codeEtudiant;
        this.nomGroupe = nomGroupe;
    }
    //empty constructor
    public Groupe(){

    }

    public String getCodeEtudiant() {
        return codeEtudiant;
    }

    public void setCodeEtudiant(String codeEtudiant) {
        this.codeEtudiant = codeEtudiant;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }
}
