package Interfaces;

public interface AbsenceInterface {

    boolean AjouterAbsence(int idEtudiant, String Matiere, int nbAbsences);

    boolean deleteAbsence(int id);

    int   NbrAbsence(int idEtudiant, String Matiere);
}

