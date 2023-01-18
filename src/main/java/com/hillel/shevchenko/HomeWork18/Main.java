package com.hillel.shevchenko.HomeWork18;

public class Main {

    public static double averageArray(double[] array, double average) {

        double sumArray = 0.0;

        if (array == null) {
            return -1;
        }

        if (array.length == 0) {
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            sumArray = array[i] + sumArray;
        }
        average = sumArray / array.length;
        return average;
    }

    public static int squareArray(int[][] array2) {

        int counter = 0;


        if (array2 == null) {
            return -2;
        }

        if (array2.length == 0) {
            return -3;
        }



        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i].length == array2.length) {
                    counter++;
                } else {
                    break;
                }
                if (counter == array2.length) {
                    return 0;
                }
            }
        }
        return -1;
    }
}
