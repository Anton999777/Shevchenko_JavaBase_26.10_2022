package com.hillel.shevchenko.HomeWork16;

public abstract class MusicStyle {
    String name;

    public MusicStyle(String name) {
        this.name = name;
    }


    public abstract void playMusic ();

    public String getName() {
        return name;
    }
}
