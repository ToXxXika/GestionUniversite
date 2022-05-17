package Interfaces;

public interface MatiereInterface {
    boolean ajouterMatiere(String nom, String code,float coef);
    boolean supprimerMatiere(String code);
    boolean modifierMatiere(String nom,float coef);
    boolean verifierMatiere(String nom);

}
