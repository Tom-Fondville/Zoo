package zoo;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Infrastructure serreAmazonienne = new Infrastructure("Serre Amazonienne", 200, new BigDecimal(100));
        Animal crocodile = new Animal("Krok","Crocodylus niloticus",  500, 4.2, "Mâle", Vulnerabilite.NORMAL);
        Employe employe1 = new Employe("Bon","Jean", 1);
        Client client1 = new Client(1, new BigDecimal(100), 2);

        Zoo zoo = new Zoo("MonZoo");

        System.out.println(crocodile.toString());
        System.out.println(client1.toString());
        System.out.println(employe1.toString());
        System.out.println(serreAmazonienne.toString());



    }
}
