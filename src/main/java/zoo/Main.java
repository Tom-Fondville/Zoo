package zoo;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Infrastructure serreAmazonienne = new Infrastructure("Serre Amazonienne", 200, new BigDecimal(100));
        Animal crocodile = new Animal("Krok","Crocodylus niloticus",  500, 4.2, "Mâle", Vulnerabilite.NORMAL);
        Employe employe1 = new Employe("Bon","Jean", 1, new BigDecimal(200));
        Client client1 = new Client(1, new BigDecimal(100), 2);

        Zoo zoo = new Zoo("MonZoo");

        System.out.println(crocodile);
        System.out.println(client1);
        System.out.println(employe1);
        System.out.println(serreAmazonienne);

        employe1.getAnimaux().add(crocodile);

        System.out.println(employe1);

        zoo.getEmployes().add(employe1);
        zoo.getInfrastructures().add(serreAmazonienne);
        zoo.getClients().add(client1);

        BigDecimal ca = zoo.retourSurInvestissement();
        System.out.println(ca);



    }
}
