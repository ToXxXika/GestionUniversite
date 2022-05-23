package Interfaces;

import Models.Absences;

import java.util.List;

public interface AbsenceInterface {

    boolean AjouterAbsence(int idEtudiant, String Matiere, int nbAbsences);

    boolean deleteAbsence(String id);

    int   NbrAbsence(int idEtudiant, String Matiere);

    List<Absences> getAbsenceByEtudiant(String cin);
}

