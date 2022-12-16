package zoo.Animaux;

import zoo.Infrastructure;
import zoo.Vulnerabilite;

public abstract class Animal {
    private String nom;

    private String nomScientifique;

    //En KG
    private double masse;
    //en M
    private double taille;

    private String sexe;
    private Vulnerabilite niveauDeVulnerabilite;
    private Infrastructure infrastructure;

    public Animal(String nom, String nomScientifique, double masse, double taille, String sexe, Vulnerabilite niveauDeVulnerabilite) {
        this.nom = nom;
        this.nomScientifique = nomScientifique;
        this.masse = masse;
        this.taille = taille;
        this.sexe = sexe;
        this.niveauDeVulnerabilite = niveauDeVulnerabilite;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public Vulnerabilite getNiveauDeDanger() {
        return niveauDeVulnerabilite;
    }

    public void setNiveauDeDanger(Vulnerabilite niveauDeVulnerabilite) {
        this.niveauDeVulnerabilite = niveauDeVulnerabilite;
    }
    public Vulnerabilite getNiveauDeVulnerabilite() {
        return niveauDeVulnerabilite;
    }

    public void setNiveauDeVulnerabilite(Vulnerabilite niveauDeVulnerabilite) {
        this.niveauDeVulnerabilite = niveauDeVulnerabilite;
    }

    public Infrastructure getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(Infrastructure infrastructure) {
        this.infrastructure = infrastructure;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomScientifique() {
        return nomScientifique;
    }

    public void setNomScientifique(String nomScientifique) {
        this.nomScientifique = nomScientifique;
    }


    @Override
    public String toString() {
        return "Animal{" +
                " nom=" + nom +
                ", nom Scientifique=" + nomScientifique +
                ", masse=" + masse +
                ", taille=" + taille +
                ", sexe='" + sexe + '\'' +
                ", niveauDeVulnerabilite=" + niveauDeVulnerabilite +
                '}';
    }
}
