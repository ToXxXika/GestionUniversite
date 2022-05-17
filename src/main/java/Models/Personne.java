package Models;

public class Personne {
    String Cin ;
    String Nom ;
    String Prenom ;
    String mail ;
    String Password ;
    String Role ;

    public Personne(String cin, String nom, String prenom, String mail, String password,String role) {
        Cin = cin;
        Nom = nom;
        Prenom = prenom;
        this.mail = mail;
        Password = password;
        this.Role = role;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Personne(){}

    public String getCin() {
        return Cin;
    }

    public void setCin(String cin) {
        Cin = cin;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
