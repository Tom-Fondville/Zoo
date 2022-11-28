package zoo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Client {

    private long id;
    private BigDecimal tarif;
    private int dureeSejour;

    private BigDecimal benefice;
    private ArrayList<Infrastructure> infrastructureVisitee;

    public Client(long id, BigDecimal tarif, int dureeSejour, ArrayList<Infrastructure> infrastructureVisitee) {
        this.id = id;
        this.tarif = tarif;
        this.dureeSejour = dureeSejour;
        this.infrastructureVisitee = infrastructureVisitee;
        this.benefice = this.tarif.multiply(new BigDecimal(this.dureeSejour)) ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    public int getDureeSejour() {
        return dureeSejour;
    }

    public void setDureeSejour(int dureeSejour) {
        this.dureeSejour = dureeSejour;
    }

    public ArrayList<Infrastructure> getInfrastructureVisitee() {
        return infrastructureVisitee;
    }

    public void setInfrastructureVisitee(ArrayList<Infrastructure> infrastructureVisitee) {
        this.infrastructureVisitee = infrastructureVisitee;
    }





}
