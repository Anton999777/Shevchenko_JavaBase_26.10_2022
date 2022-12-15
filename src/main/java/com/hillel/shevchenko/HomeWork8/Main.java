package com.hillel.shevchenko.HomeWork8;

public class Main {
    public static void main(String[] args) {

        int badnumb1 = 4;
        int badnumb2 = 9;
        int counter = 0;

        for (int i = 1; i <= 155; i++) {
            if (i > 99) {
                if (i / 10 % 10 == badnumb1 || i % 10 == badnumb1) {
                    continue;
                } else if (i / 10 % 10 == badnumb2 || i % 10 == badnumb2) {
                    continue;
                }
            }

            if (i / 10 == badnumb1 || i % 10 == badnumb1) {
                continue;
            } else if (i / 10 == badnumb2 || i % 10 == badnumb2) {
                continue;
            }
            System.out.println("number shuttle " + " = " + i);
            counter++;
        }

        System.out.println("counter shuttle = " + counter);


    }
    }



