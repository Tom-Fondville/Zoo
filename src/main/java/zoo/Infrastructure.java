package zoo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Infrastructure {

    private String nom;

    //en m carré
    private int surface;

    //en euro
    private BigDecimal coutEntretien;

    private ArrayList<Animal> listAnimaux;


    public Infrastructure(String nom, int surface, BigDecimal coutEntretien) {
        this.nom = nom;
        this.surface = surface;
        this.coutEntretien = coutEntretien;
        this.listAnimaux = new ArrayList<Animal>();
    }

    public int getSurface() {
        return surface;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public BigDecimal getCoutEntretien() {
        return coutEntretien;
    }

    public void setCoutEntretien(BigDecimal coutEntretien) {
        this.coutEntretien = coutEntretien;
    }

    @Override
    public String toString() {
        return "Infrastructure{" +
                "nom='" + nom + '\'' +
                ", surface=" + surface +
                ", coutEntretien=" + coutEntretien +
                ", listAnimaux=" + listAnimaux +
                '}';
    }
}
