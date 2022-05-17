package Models;

public class Enseignants extends Personne{
    int cnss ;

    public Enseignants(String cin, String nom, String prenom, String mail, String password,String Role, int cnss) {
        super(cin, nom, prenom, mail, password,Role);
        this.cnss = cnss;
    }

    public Enseignants() {

    }

    public int getCnss() {
        return cnss;
    }

    public void setCnss(int cnss) {
        this.cnss = cnss;
    }
}
