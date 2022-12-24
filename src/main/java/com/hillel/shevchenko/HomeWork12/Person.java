package com.hillel.shevchenko.HomeWork12;

public class Person {
    public static void main(String[] args) {
       personInfo("Anton", "Shevchenko", "Kharkiv", "43534534543");
        personInfo("Will", "Smith", "New York", "444444444");
        personInfo("Jackie", "Chan", "Shanghai", "4565463435345");


    }

    static String personInfo (String name, String surname, String city, String phoneNumber) {

        return "Зателефонувати громадянинові " + name + " " + surname + " із міста " + city +
                " можна за номером " + phoneNumber;
    }
//        System.out.println("Зателефонувати громадянинові " + name + " " + surname + " із міста " + city +
//                " можна за номером " + phoneNumber)

}
