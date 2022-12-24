package com.hillel.shevchenko.HomeWork13;

public class Burger {
    String mayonnaise;
    String roll;
    String meat;
    int amountOfChops;
    String cheese;
    String green;

    public Burger(String roll, String meat, String cheese, String green, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
    }
    public Burger(String roll, String meat, String cheese, String green) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
    }
    public Burger(String mayonnaise, String roll, String meat, int amountOfChops, String cheese, String green) {
        this.mayonnaise = mayonnaise;
        this.roll = roll;
        this.meat = meat;
        this.amountOfChops = amountOfChops;
        this.cheese = cheese;
        this.green = green;
    }

    void mainBurger (){
        String str = "Main Burger: {" +
                "mayonnaise='" + mayonnaise + '\'' +
                ", roll='" + roll + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                '}';
        System.out.println(str);
    }

    void dietBurger (){
        String str = "DIet Burger: {" +
                "roll='" + roll + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                '}';
        System.out.println(str);
    }

    void doubleMeatBurger () {
        String str =  "Double Meat Burger: {" +
                "mayonnaise='" + mayonnaise + '\'' +
                ", roll='" + roll + '\'' +
                ", meat='" + meat + '\'' +
                ", amountOfChops=" + amountOfChops +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                '}';
        System.out.println(str);
    }

//    @Override
//    public String toString() {
//        if (mayonnaise == null) {
//            return "Burger{" +
//                    "roll='" + roll + '\'' +
//                    ", meat='" + meat + '\'' +
//                    ", cheese='" + cheese + '\'' +
//                    ", green='" + green + '\'' +
//                    '}';
//        } else if (amountOfChops == 0) {
//            return "Burger{" +
//                    "mayonnaise='" + mayonnaise + '\'' +
//                    ", roll='" + roll + '\'' +
//                    ", meat='" + meat + '\'' +
//                    ", cheese='" + cheese + '\'' +
//                    ", green='" + green + '\'' +
//                    '}';
//        } else {
//            return  "Burger{" +
//                    "mayonnaise='" + mayonnaise + '\'' +
//                    ", roll='" + roll + '\'' +
//                    ", meat='" + meat + '\'' +
//                    ", amountOfChops=" + amountOfChops +
//                    ", cheese='" + cheese + '\'' +
//                    ", green='" + green + '\'' +
//                    '}';
        }

