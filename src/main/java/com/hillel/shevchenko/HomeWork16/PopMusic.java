package com.hillel.shevchenko.HomeWork16;

public class PopMusic extends MusicStyle {

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Music style " + getName() + " is pop music");
    }
}
