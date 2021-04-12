package com.hillel.lesson10.homework;

public final class Iphone extends Smartphone {

    private String model;
    private int storage;

    public Iphone(String brand, int yearOfIssue, String operationSystem, String color, String model, int storage) {
        super(brand, yearOfIssue, operationSystem, color);
        this.model = model;
        this.storage = storage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
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

    public void callingFaceTime() {
        System.out.println("calling FaceTime");
    }

    @Override
    public String toString() {
        return super.toString() + "Iphone{" +
                "model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }
}
