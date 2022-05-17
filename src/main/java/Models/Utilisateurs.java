package Models;

public class Utilisateurs {
    String cin ;
    String motdepasse ;
    String Role ;

    public Utilisateurs(String cin, String motdepasse, String role) {
        this.cin = cin;
        this.motdepasse = motdepasse;
        Role = role;
    }
    public  Utilisateurs(){

    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
