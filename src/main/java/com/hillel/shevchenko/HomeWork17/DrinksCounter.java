package com.hillel.shevchenko.HomeWork17;

public class DrinksCounter {
    private static int counter;

    public DrinksCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
