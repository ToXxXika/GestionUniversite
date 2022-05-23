package Models;

public class Moyenne {
    int NumInsc;
    String Nom;
    String Prenom;
    String Matiere;
    float Moyenne;

    public Moyenne() {
    }

    public Moyenne(int numInsc, String nom, String prenom, String matiere, float moyenne) {
        NumInsc = numInsc;
        Nom = nom;
        Prenom = prenom;
        Matiere = matiere;
        Moyenne = moyenne;
    }

    public int getNumInsc() {
        return NumInsc;
    }

    public void setNumInsc(int numInsc) {
        NumInsc = numInsc;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getMatiere() {
        return Matiere;
    }

    public void setMatiere(String matiere) {
        Matiere = matiere;
    }

    public float getMoyenne() {
        return Moyenne;
    }

    public void setMoyenne(float moyenne) {
        Moyenne = moyenne;
    }
}
