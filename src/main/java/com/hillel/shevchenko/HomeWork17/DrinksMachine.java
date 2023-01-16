package com.hillel.shevchenko.HomeWork17;

public enum DrinksMachine {


    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    WATER("Water"),
    COCA_COLA("Coca-Cola"),

    EXIT("exit");

    private String nameDrink;

    public String getNameDrink() {
        return nameDrink;
    }

    DrinksMachine(String nameDrink) {
        this.nameDrink = nameDrink;
    }

}


