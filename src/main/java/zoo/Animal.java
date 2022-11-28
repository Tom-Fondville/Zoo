package zoo;

public class Animal {

    private double masse;
    private double taille;

    private String sexe;
    private Vulnerabilite niveauDeVulnerabilite;
    private Infrastructure infrastructure;

    public Animal(double masse, double taille, String sexe, Vulnerabilite niveauDeVulnerabilite, Infrastructure infrastructure) {
        this.masse = masse;
        this.taille = taille;
        this.sexe = sexe;
        this.niveauDeVulnerabilite = niveauDeVulnerabilite;
        this.infrastructure = infrastructure;
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
}
