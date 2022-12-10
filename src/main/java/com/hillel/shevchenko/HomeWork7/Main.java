package com.hillel.shevchenko.HomeWork7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int random = (int) (Math.random() * 11);

        Scanner scanner = new Scanner(System.in);

        int numberUser = 0;
        System.out.println("Please guess the number from 0 to 10. You have 4 attempts");

        int numberOfAttempts = 4;

        while (numberOfAttempts >= 0) {
            if (numberOfAttempts == 0) {
                System.out.println("You lost :( computer number " + random + " and your number " + numberUser);
                break;
            } numberOfAttempts--;
            if (scanner.hasNextInt()) {
                numberUser = scanner.nextInt();
                System.out.println(numberUser);
                if (random < numberUser) {
                    System.out.println("Try again, your number is more than mystical");
                } else if (random > numberUser) {
                    System.out.println("Try again, your number is less than mystical");
                } else {
                    System.out.println("YOU WIN!!!");
                    break;
                }
            } else {
                System.out.println("Wrong data! Try again");
                scanner.nextLine();
            }
        }
    }
}




