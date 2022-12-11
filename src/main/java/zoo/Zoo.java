package zoo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Zoo {

    private String nom;
    private ArrayList<Infrastructure> infrastructures;
    private ArrayList<Employe> employes;

    private ArrayList<Client> clients;

    public Zoo(String nom) {
        this.nom = nom;
        this.infrastructures = new ArrayList<Infrastructure>();
        this.employes = new ArrayList<Employe>();
        this.clients = new ArrayList<Client>();
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

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public BigDecimal retourSurInvestissement(){

        BigDecimal couts = new BigDecimal(0);

        for(Infrastructure infrastructure : this.infrastructures ){
            couts = couts.add(infrastructure.getCoutEntretien());
        }

        for(Employe employe : employes){
            couts = couts.add(employe.getSalaire());
        }

        BigDecimal gains = new BigDecimal(0);

        for(Client client : clients){
            gains = gains.add(client.getTarif().multiply(new BigDecimal(client.getDureeSejour())));
        }

        BigDecimal roi = new BigDecimal(0);
        roi = roi.add(gains.subtract(couts));

        return roi;
    }

    public boolean ajouterEmploye(Employe employe){
        return this.employes.add(employe);
    }
    public boolean ajouterClient(Client client){
        return this.clients.add(client);
    }

    public boolean ajouterInfrastructure(Infrastructure infrastructure){
        return this.infrastructures.add(infrastructure);
    }




}
