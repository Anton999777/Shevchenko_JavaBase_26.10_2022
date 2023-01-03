package com.hillel.shevchenko.HomeWork16;

public class ClassicMusic extends MusicStyle {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Music style " + getName() + " is classic music");
    }
}
