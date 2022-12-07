package zoo;

import java.util.ArrayList;

public class Zoo {

    private String nom;
    private ArrayList<Infrastructure> infrastructures;
    private ArrayList<Employe> employes;

    public Zoo(String nom) {
        this.nom = nom;
        this.infrastructures = new ArrayList<Infrastructure>();
        this.employes = new ArrayList<Employe>();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Infrastructure> getInfrastructures() {
        return infrastructures;
    }

    public void setInfrastructures(ArrayList<Infrastructure> infrastructures) {
        this.infrastructures = infrastructures;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }
}
