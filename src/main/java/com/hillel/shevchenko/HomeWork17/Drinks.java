package com.hillel.shevchenko.HomeWork17;

import java.util.Arrays;
import java.util.Scanner;

public class Drinks {

    final static int priceCoffee = 8;
    final static int priceTea = 5;
    final static int priceLemonade = 10;
    final static int priceMojito = 10;
    final static int priceWater = 5;
    final static int priceCoCaCola = 8;

     private static int amountOfMoney = 0;



    private static int getPriceCoffee() {
        return priceCoffee;
    }

    private static int getPriceTea() {
        return priceTea;
    }

    private static int getPriceLemonade() {
        return priceLemonade;
    }

    private static int getPriceMojito() {
        return priceMojito;
    }

    private static int getPriceWater() {
        return priceWater;
    }

    private static int getPriceCoCaCola() {
        return priceCoCaCola;
    }


    public static void runApp () {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            DrinksMachine[] valuesDrinks = DrinksMachine.values();
            DrinksMachine userChoice = null;


            while (true) {
                System.out.println("Please choose a drink or enter an exit if you don't want anything: "
                        + (Arrays.toString(valuesDrinks)));

                String userWord = scanner.nextLine();
                userWord = userWord.toUpperCase();

                if (userWord.equals("EXIT")) {
                    userChoice = DrinksMachine.valueOf(userWord);
                    break;
                }

                for (DrinksMachine drinksMachine : valuesDrinks) {
                    if (drinksMachine.toString().equals(userWord)) {
                        userChoice = DrinksMachine.valueOf(userWord);
                    }
                }
                if (userChoice != null) {
                    break;
                }
            }

            switch (userChoice) {
                case COFFEE: {
                    makeCoffee();
                    new DrinksCounter();
                    amountOfMoney = amountOfMoney + getPriceCoffee();
                    break;
                }
                case TEA: {
                    makeTea();
                    new DrinksCounter();
                    amountOfMoney = amountOfMoney + getPriceTea();
                    break;
                }
                case WATER: {
                    makeWater();
                    new DrinksCounter();
                    amountOfMoney = amountOfMoney + getPriceWater();
                    break;
                }
                case MOJITO: {
                    makeMojito();
                    new DrinksCounter();
                    amountOfMoney = amountOfMoney + getPriceMojito();
                    break;
                }
                case LEMONADE: {
                    makeLemonade();
                    new DrinksCounter();
                    amountOfMoney = amountOfMoney + getPriceLemonade();
                    break;
                }
                case COCA_COLA: {
                    makeCocaCola();
                    new DrinksCounter();
                    amountOfMoney = amountOfMoney + getPriceCoCaCola();
                    break;
                }
            }
            if (userChoice.equals(DrinksMachine.EXIT)) {
                System.out.println("total amount due: " + amountOfMoney + "\u0024");
                break;
            }
        }
    }



    private static void makeCoffee() {
        System.out.println("take your coffee: water + espresso + sugar");
        System.out.println("coffee cost: " + getPriceCoffee() + "\u0024");
    }

    private static void makeTea() {
        System.out.println("take your Tea: water + green tea + sugar");
        System.out.println("cost tea: " + getPriceTea() + "\u0024");
    }
    private static void makeWater() {
        System.out.println("take your water: sparkling water");
        System.out.println("water cost: " + getPriceWater() + "\u0024");
    }
    private static void makeMojito() {
        System.out.println("take your Mojito: lime + mint + mint syrup + sprite + rum + ice");
        System.out.println("cost mojito: " + getPriceMojito() + "\u0024");
    }
    private static void makeLemonade() {
        System.out.println("take your lemonade: ice + lemon + sparkling water");
        System.out.println("cost lemonade: " + getPriceLemonade() + "\u0024");
    }
    private static void makeCocaCola() {
        System.out.println("take your coca_cola: coca cola in a can");
        System.out.println("cost coca_cola: " + getPriceCoCaCola() + "\u0024");
    }

}
