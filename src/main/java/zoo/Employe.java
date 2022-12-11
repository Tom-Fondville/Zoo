package zoo;

import zoo.Animaux.Animal;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Employe {

    private String nom;
    private String prenom;
    private int matricule;
    private BigDecimal salaire;
    private ArrayList<Animal> animaux;


    public Employe(String nom, String prenom, int matricule, BigDecimal salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.salaire = salaire;
        this.animaux = new ArrayList<Animal>();
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

    public BigDecimal getSalaire() {
        return salaire;
    }

    public void setSalaire(BigDecimal salaire) {
        this.salaire = salaire;
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(ArrayList<Animal> animaux) {
        this.animaux = animaux;
    }

    public boolean ajouterAnimal(Animal animal){
        return this.animaux.add(animal);
    }


    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule=" + matricule +
                ", salaire=" + salaire +
                ", animaux=" + animaux +
                '}';
    }
}
