package com.hillel.shevchenko.HomeWork10;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {

        int[] organizer = new int[7];
        int[] player = new int[7];

        for (int i = 0; i < organizer.length; i++) {
            organizer[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < player.length; i++) {
            player[i] = (int) (Math.random() * 10);
        }

        System.out.println("Числа загадані організатором = " + Arrays.toString(organizer));
        System.out.println("Числа загадані гравцем = " + Arrays.toString(player));
        System.out.println();

        Arrays.sort(organizer);
        Arrays.sort(player);

        System.out.println("Числа відсортовані за зростанням:");
        System.out.println(Arrays.toString(organizer));
        System.out.println(Arrays.toString(player));
        System.out.println();

        int coincidences = 0;
        System.out.println("Знаходимо збіги елементів в комірках двух массивів:");


        for (int i = 0; i < organizer.length; i++) {
            if (organizer[i] == player[i]) {
                coincidences++;
                System.out.println("Елементи збіглися у комірках = " + i);
            }
        }
        System.out.println("Кількість збігів = " + coincidences);
    }
}
