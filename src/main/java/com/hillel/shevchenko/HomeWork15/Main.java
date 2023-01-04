package com.hillel.shevchenko.HomeWork15;

public class Main {
    public static void main(String[] args) {

        Androids android = new Androids("Samsung","Galaxy");

        android.startOperationSystemLinuxOS();
        android.call();
        android.sms();
        android.internet();

        System.out.println();
        IPhones iphone = new IPhones("Iphone","4s");

        iphone.startOperationSystemIos();
        iphone.call();
        iphone.internet();
        iphone.sms();
    }
}
