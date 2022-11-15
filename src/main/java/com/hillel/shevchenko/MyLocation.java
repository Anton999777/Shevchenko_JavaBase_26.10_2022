package com.hillel.shevchenko;

public class MyLocation {
    public static void main(String[] args) {

        //52°05'01.9"N 15°13'48.6"E

        int height = 52;

        char degree = '\u00B0';

        height = 05;

        char someSymb = '\'';

        float someNumb = 1.9F;

        char some2Symb = '\u0022';
        char some3Symb = 'N';

        System.out.println("52" + degree + height + someSymb + someNumb +some2Symb + some3Symb);

        int width = 15;
        System.out.println(width);

        char degree2 = '\u00B0';
        System.out.println(degree2);

        width = 13;
        System.out.println(width);

        char widthSymb = '\'';
        System.out.println(widthSymb);

        double widthSymb2 = 48.6;
        System.out.println(widthSymb2);

        char widthSymb3 = '\"';

        char widthSymb4 = 'E';
        System.out.println(widthSymb3);
        System.out.println(widthSymb4);

    }
}
