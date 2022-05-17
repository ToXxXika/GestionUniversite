package Models;

public class Etudiants extends Personne {
    int NumInsc ;

    public Etudiants(String cin, String nom, String prenom, String mail, String password,String Role, int numInsc) {
        super(cin, nom, prenom, mail, password,Role);
        NumInsc = numInsc;
    }

    public Etudiants() {
    }

    public int getNumInsc() {
        return NumInsc;
    }

    public void setNumInsc(int numInsc) {
        NumInsc = numInsc;
    }
}
