package com.hillel.shevchenko.HomeWork15;

public class IPhones implements Smartphones,IOS {

    String name;
    String model;

    public IPhones(String name, String model) {
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
        System.out.println("Iphone call");
    }

    @Override
    public void sms() {
        System.out.println("Iphone received sms");
    }

    @Override
    public void internet() {
        System.out.println("Iphone accepts internet");
    }

    @Override
    public void startOperationSystemIos() {
        System.out.println("Start IOS system");
    }
}
