package com.hillel.lesson10.homework;

public final class Android extends Smartphone {

    private String model;
    private int storage;

    public Android(String brand, int yearOfIssue, String operationSystem, String color, String model, int storage) {
        super(brand, yearOfIssue, operationSystem, color);
        this.model = model;
        this.storage = storage;
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void goingToInternet() {
        super.goingToInternet();
    }

    public void callingDuo() {
        System.out.println("calling Duo");
    }

    @Override
    public void startApp() {
        System.out.println("Android is stared App");
    }

    @Override
    public void closeApp() {
        System.out.println("Android is closed App");
    }

    @Override
    public void sendTelegramMessage() {
        System.out.println("Android is send message");
    }

    @Override
    public void readTelegramMessage() {
        System.out.println("Android is reading message");
    }

    @Override
    public String toString() {
        return super.toString() + "Android{" +
                "model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }
}
