package de.dumbuya;

public class Television {
    private String brand;
    private String model;
    private int size;
    private boolean isTvOn;

    public Television(String brand, String model, int size, boolean isTvOn) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.isTvOn = isTvOn;
    }

    public void turnOn() {
        isTvOn = true;
        System.out.println("The television is on.");
    }

    public void turnOff() {
        isTvOn = false;
        System.out.println("The television is off.");
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }
}
