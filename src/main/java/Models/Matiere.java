package Models;

public class Matiere {
    int id ;
    String Nom ;

    float Coefficient ; // coefficient de la matiere

    //main constructor
    public Matiere(String nom, float Coefficient ) {
        Nom = nom;

        this.Coefficient = Coefficient;
    }
    //constructor with id
    public Matiere(int id ,String nom, float Coefficient ) {
        this.id = id;
        Nom = nom;

        this.Coefficient = Coefficient;
    }

    public int getId() {
        return id;
    }

    public float getCoefficient() {
        return Coefficient;
    }

    //empty constructor
    public Matiere() {
    }
    //getters and setters
    public String getNom() {
        return Nom;
    }
    // getter and setter of Code


}
