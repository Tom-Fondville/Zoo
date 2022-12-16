package zoo;


import zoo.Animaux.Animal;
import zoo.Animaux.Crocodile;
import zoo.Animaux.Girafe;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Infrastructure serreAmazonienne = new Infrastructure("Serre Amazonienne", 200, new BigDecimal(100));
        Animal crocodile = new Crocodile("Krok","Crocodylus niloticus",  500, 4.2, "Mâle", Vulnerabilite.NORMAL);
        Animal girafe = new Girafe("Jaune","Giraphus grandus",  700, 18.2, "Mâle", Vulnerabilite.MENACEES);
        Employe employe1 = new Employe("Bon","Jean", 1, new BigDecimal(200));
        Client client1 = new Client(1, new BigDecimal(100), 2);

        Zoo zoo = new Zoo("MonZoo");

        System.out.println(crocodile);
        System.out.println(client1);
        System.out.println(employe1);
        System.out.println(serreAmazonienne);

        employe1.ajouterAnimal(crocodile);
        employe1.ajouterAnimal(girafe);

        System.out.println(employe1);

        zoo.ajouterEmploye(employe1);
        zoo.ajouterInfrastructure(serreAmazonienne);
        zoo.ajouterClient(client1);

        BigDecimal ca = zoo.retourSurInvestissement();
        System.out.println(ca);



    }
}
