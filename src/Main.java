import Coffee.*;
import Desert.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("client");
        Random rand = new Random();

        int timeToSimulate = 60; // in minutes
        int timePassed = 0;
        int totalRevenue = 0;

        while(timePassed < timeToSimulate) {
            int randName = rand.nextInt(5) + 1;
            if (randName == 1) {
                client.setName("Greg");
            } else if (randName == 2) {
                client.setName("Alex");
            } else if (randName == 3) {
                client.setName("Anna");
            } else if (randName == 4) {
                client.setName("Bob");
            } else {
                client.setName("Alice");
            }

            int randomWillTip = rand.nextInt(2) + 1;
            if (randomWillTip == 1) {
                client.setWillTip(false);
            } else {
                client.setWillTip(true);
            }

            int randomWantsDesert = rand.nextInt(2) + 1;
            if (randomWantsDesert == 1) {
                client.setWantsDesert(false);
            } else {
                client.setWantsDesert(true);
            }

            int randCoffee = rand.nextInt(9) + 1;
            switch (randCoffee) {
                case 1:
                    System.out.println(client.getName() + " ordered an Espresso");
                    Espresso espresso = new Espresso();
                    espresso.makeCoffee();
                    totalRevenue += espresso.getPrice();
                    timePassed += 2;
                    break;
                case 2:
                    System.out.println(client.getName() + " ordered an Americano");
                    Americano americano = new Americano();
                    americano.makeCoffee();
                    totalRevenue += americano.getPrice();
                    timePassed += 3;
                    break;
                case 3:
                    System.out.println(client.getName() + " ordered an Affogato");
                    Affogato affogato = new Affogato();
                    affogato.makeCoffee();
                    totalRevenue += affogato.getPrice();
                    timePassed += 3;
                    break;
                case 4:
                    System.out.println(client.getName() + " ordered a Cappucino");
                    Cappucino cappucino = new Cappucino();
                    cappucino.makeCoffee();
                    totalRevenue += cappucino.getPrice();
                    timePassed += 4;
                    break;
                case 5:
                    System.out.println(client.getName() + " ordered a Flat White");
                    FlatWhite flatWhite = new FlatWhite();
                    flatWhite.makeCoffee();
                    totalRevenue += flatWhite.getPrice();
                    timePassed += 4;
                    break;
                case 6:
                    System.out.println(client.getName() + " ordered an Irish Coffee");
                    IrishCoffee irishCoffee = new IrishCoffee();
                    irishCoffee.makeCoffee();
                    totalRevenue += irishCoffee.getPrice();
                    timePassed += 4;
                    break;
                case 7:
                    System.out.println(client.getName() + " ordered a Macchiato");
                    Macchiato macchiato = new Macchiato();
                    macchiato.makeCoffee();
                    totalRevenue += macchiato.getPrice();
                    timePassed += 3;
                    break;
                case 8:
                    System.out.println(client.getName() + " ordered a Mochaccino");
                    Mochaccino mochaccino = new Mochaccino();
                    mochaccino.makeCoffee();
                    totalRevenue += mochaccino.getPrice();
                    timePassed += 5;
                    break;
                case 9:
                    System.out.println(client.getName() + " ordered a Vietnamese Coffee");
                    VietnameseCoffee vietnameseCoffee = new VietnameseCoffee();
                    vietnameseCoffee.makeCoffee();
                    totalRevenue += vietnameseCoffee.getPrice();
                    timePassed += 6;
                    break;
            }
            System.out.println("And after all of this he served it to the customer");
            if (client.isWantsDesert()) {
                int whatDessert = rand.nextInt(5) + 1;
                switch (whatDessert) {
                    case 1:
                        Muffin muffin = new Muffin();
                        System.out.println(client.getName() + " also ordered a muffin that was " + muffin.getDesertPrice() + " lei");
                        totalRevenue += muffin.getDesertPrice();
                        break;
                    case 2:
                        Croissant croissant = new Croissant();
                        System.out.println(client.getName() + " also ordered a croissant that was " + croissant.getDesertPrice() + " lei");
                        totalRevenue += croissant.getDesertPrice();
                        break;
                    case 3:
                        ChocolateCroissant chocolateCroissant = new ChocolateCroissant("chocolate");
                        System.out.println(client.getName() + " also ordered a croissant with chocolate that was " + chocolateCroissant.getDesertPrice() + " lei");
                        totalRevenue += chocolateCroissant.getDesertPrice();
                        break;
                    case 4:
                        CherryMuffin cherryMuffin = new CherryMuffin("cherry");
                        System.out.println(client.getName() + " also ordered a muffin with cherry that was " + cherryMuffin.getDesertPrice() + " lei");
                        totalRevenue += cherryMuffin.getDesertPrice();
                        break;
                    case 5:
                        Cheesecake cheesecake = new Cheesecake();
                        System.out.println(client.getName() + " also ordered a cheesecake that was " + cheesecake.getDesertPrice() + " lei");
                        totalRevenue += cheesecake.getDesertPrice();
                }
            }

            if (client.isWillTip()) {
                int tip = rand.nextInt(20) + 1;
                System.out.println("In the end the client also tipped the barista " + tip + " lei");
            }
            System.out.println("***************************************************");
        }
        System.out.println("The time to simulate has ended");
        System.out.println("Total revenue in this day was: " + totalRevenue + " lei");
    }
}