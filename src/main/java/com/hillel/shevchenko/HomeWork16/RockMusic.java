package com.hillel.shevchenko.HomeWork16;

public class RockMusic extends MusicStyle {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Music style " + getName() + " is Rock music");
    }
}
