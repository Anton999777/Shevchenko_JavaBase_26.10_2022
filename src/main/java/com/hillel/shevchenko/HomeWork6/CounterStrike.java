package com.hillel.shevchenko.HomeWork6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести ім'я першої команди");
        String team1name = scanner.nextLine();

        System.out.println(team1name);

        System.out.println("Ввести кількість фрагів для 5-ти гравців першої команди");
        double player1Navi = scanner.nextInt();
        double player2Navi = scanner.nextInt();
        double player3Navi = scanner.nextInt();
        double player4Navi = scanner.nextInt();
        double player5Navi = scanner.nextInt();

        double avgFragsTeam1 = (player1Navi + player2Navi + player3Navi + player4Navi + player5Navi) / 5.0;

        System.out.println("Середнє арифметичне балів першої команди = " + avgFragsTeam1);
        scanner.nextLine();
        System.out.println("Ввести ім'я другої команди");
        String team2name = scanner.nextLine();

        System.out.println("Ввести кількість фрагів для 5-ти гравців другої команди");

        int plr1Astralis = scanner.nextInt();
        int plr2Astralis = scanner.nextInt();
        int plr3Astralis = scanner.nextInt();
        int plr4Astralis = scanner.nextInt();
        int plr5Astralis = scanner.nextInt();

        double avgFragsTeam2 = ((plr1Astralis + plr2Astralis + plr3Astralis + plr4Astralis + plr5Astralis) / 5.0);

        System.out.println("Середнє арифметичне балів другої команди = " + avgFragsTeam2);

        if (avgFragsTeam1 > avgFragsTeam2) {
            System.out.println(" Перемогла команда " + team1name + " набрала " + avgFragsTeam1 + " очків ");

        } else if (avgFragsTeam1 < avgFragsTeam2) {
            System.out.println(" Перемогла команда " + team2name + " набрала " + avgFragsTeam2 + " очків ");

        } else {
            System.out.println(" between " + team1name + " and " + team2name + " draw ");
        }


    }
}
