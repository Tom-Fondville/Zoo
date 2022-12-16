package zoo.Animaux;

import zoo.Vulnerabilite;

public class Girafe extends Animal{
    public Girafe(String nom, String nomScientifique, double masse, double taille, String sexe, Vulnerabilite niveauDeVulnerabilite) {
        super(nom, nomScientifique, masse, taille, sexe, niveauDeVulnerabilite);
    }

    @Override
    public String toString(){
        return super.toString() + "j'ai un long coup";
    }
}
