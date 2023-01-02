package com.hillel.shevchenko.HomeWork14;

public class Main {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Anton", 30,"August",1997,
                "sobaka@gmail.com",1233423221,"Shevcenko", 70, 120,
                160,2500);

        FitnessTracker user2 = new FitnessTracker("Edik", 34,"August", 1998,
                "qwe321@gmail.com", 3444,"Kovalev",55,130,
                150,20000);

        FitnessTracker user3 = new FitnessTracker("Vika",13,"December", 1999,
                "asdf@mail.com",11111, "Family",52,115,
                135,5000);

        FitnessTracker user4 = new FitnessTracker("Aleksandra",9,"April",2000,
                "kot@gmail.com",55555,"Zelenko",48,
                140,160,3500);
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();

        user2.setWeight(87);
        user2.setNumberOfStepsPerDay(8500);
        user4.setNumberOfStepsPerDay(17000);
        user4.setSurname("Krivulina");

        user2.printAccountInfo();
        user4.printAccountInfo();



    }
}
