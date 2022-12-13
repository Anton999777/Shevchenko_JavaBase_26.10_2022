package com.hillel.shevchenko.HomeWork9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        int[] team1 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int) (Math.random() * 23);
            }
        System.out.println(Arrays.toString(team1));

        int value1 = team1[0];

        for (int i = 1; i < team1.length; i++) {
             value1 = value1 + team1[i];
        }
        System.out.println("Загальна кількість років team1 = " + value1);

        double avgAge = (double) value1 / team1.length;
        System.out.println("Середній вік team1 = " + avgAge);
        System.out.println(" ");


        int[] team2 = new int[25];

        for (int i = 0; i < team2.length; i++) {
            team2[i] = 18 + (int) (Math.random() * 23);
        }
        System.out.println(Arrays.toString(team2));

        int value2 = team2[0];

        for (int i = 1; i < team2.length ; i++) {
            value2 = value2 + team2[i];
        }
        System.out.println("Загальна кількість років team2 = " + value2);

        double avgAge2 = (double) value2 / team2.length;
        System.out.println("Середній вік team2 = " + avgAge2);

        }
    }

