package com.hillel.shevchenko.HomeWork16;

public class Main {
    public static void main(String[] args) {

        MusicStyle[] bands = {
        new PopMusic("Pop band"),
                new ClassicMusic("Classic band"),
        new RockMusic("Rock band")
        };

        for (MusicStyle band : bands) {
            band.playMusic();
        }

        }
    }

