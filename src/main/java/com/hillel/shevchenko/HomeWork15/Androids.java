package com.hillel.shevchenko.HomeWork15;

public class Androids implements Smartphones,LinuxOS {

    String name;
    String model;

    public Androids(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void call() {
        System.out.println("Androids call");
    }

    @Override
    public void sms() {
        System.out.println("Android received sms");
    }

    @Override
    public void internet() {
        System.out.println("Android accepts internet");
    }

    @Override
    public void startOperationSystemLinuxOS() {
        System.out.println("Start LinuxOS system");
    }
}
