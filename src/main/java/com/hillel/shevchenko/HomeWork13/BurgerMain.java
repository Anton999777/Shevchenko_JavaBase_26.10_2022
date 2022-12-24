package com.hillel.shevchenko.HomeWork13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger mainBurger = new Burger("roll","meat","cheese","green","mayonnaise");
        Burger dietBurger = new Burger("roll","meat","cheese","green");
        Burger doubleMeat = new Burger("mayonnaise","roll","meat",2,"cheese",
                "green");

        mainBurger.mainBurger();
        dietBurger.dietBurger();
        doubleMeat.doubleMeatBurger();
    }
}
