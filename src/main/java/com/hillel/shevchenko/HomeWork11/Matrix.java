package com.hillel.shevchenko.HomeWork11;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розміри масиву");
        int number1;
        int number2;


        while (true) {
            if (scanner.hasNextInt()) {
                number1 = scanner.nextInt();
                number2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong Data. Try again.");
                scanner.nextLine();
            }
        }

        int[][] arrays1 = new int[number1][number2];

        for (int i = 0; i < arrays1.length; i++) {
            for (int j = 0; j < arrays1[i].length; j++) {
                arrays1[i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println("First array:");
        for (int i = 0; i < arrays1.length; i++) {
            for (int j = 0; j < arrays1[i].length; j++) {
                System.out.print(arrays1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Second array:");


        int[][] arrays2 = new int[number2][number1];

        for (int i = 0; i < arrays2.length; i++) {
            for (int j = 0; j < arrays1.length; j++) {
                arrays2[i][j] = arrays1[j][i];
            }
        }
        for (int i = 0; i < arrays2.length; i++) {
            for (int j = 0; j < arrays2[i].length; j++) {
                System.out.print(arrays2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
