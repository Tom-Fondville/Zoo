package zoo;

import java.util.ArrayList;

public class Employe {

    private String nom;
    private String prenom;
    private int matricule;
    private ArrayList<Animal> animaux;


    public Employe(String nom, String prenom, int matricule, ArrayList<Animal> animaux) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.animaux = animaux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(ArrayList<Animal> animaux) {
        this.animaux = animaux;
    }
}
