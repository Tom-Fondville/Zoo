package zoo.Animaux;

import zoo.Vulnerabilite;

public class Crocodile extends Animal{
    public Crocodile(String nom, String nomScientifique, double masse, double taille, String sexe, Vulnerabilite niveauDeVulnerabilite) {
        super(nom, nomScientifique, masse, taille, sexe, niveauDeVulnerabilite);
    }

    @Override
    public String toString() {
        return super.toString() + "\n je suis un Crocodile";
    }
}
