package Models;

public class Matiere {
    String Nom ;
    String Code ;
    float Coefficient ; // coefficient de la matiere

    //main constructor
    public Matiere(float Coefficient ,String nom, String code) {
        Nom = nom;
        Code = code;
        this.Coefficient = Coefficient;
    }
    //empty constructor
    public Matiere() {
    }
    //getters and setters
    public String getNom() {
        return Nom;
    }
    // getter and setter of Code
    public String getCode() {
        return Code;
    }
    public void setCode(String code) {
        Code = code;
    }

}
