package com.hillel.shevchenko.HomeWork18;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.hillel.shevchenko.HomeWork18.Main.squareArray;

public class TestArrayUtil {
    public static double[] array = null;
    public static int[][] array2 = null;

    @BeforeAll
    public static void numberArray() {
        array = new double[] {1, 2, 3, 4, 6};
        array2 = new int[3][3];
    }
    @Test
    public void test1() {
        double averageSum = Main.averageArray(array, 3.2);
        Assertions.assertEquals(3.2, averageSum);
    }

    @Test
    public void test2() {
        Assertions.assertEquals(-1, Main.averageArray(null,3.2));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(-2, Main.averageArray(new double[0], 3.2));
    }

    @AfterAll
    public static void ending() {
        System.out.println("end");
    }

    @Test
    public void test4() {
        Assertions.assertEquals(0, squareArray(array2));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(-1, squareArray(new int[4][6]));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(-2, squareArray(null));
    }

    @Test
    public void test7() {
        Assertions.assertEquals(-3, squareArray(new int[0][0]));
    }
}
