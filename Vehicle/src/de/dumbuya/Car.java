package de.dumbuya;

public class Car extends Vehicle {
    private int wheels;
    private int seats;
    private boolean isAutomatic;
    private String color;
    private String fuel;
    private int currentGear;

    public Car(String name, String size, int wheels, int seats, boolean isAutomatic, String color, String fuel) {
        super(name, size);
        this.wheels = wheels;
        this.seats = seats;
        this.isAutomatic = isAutomatic;
        this.color = color;
        this.fuel = fuel;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int velocity, int direction) {
        System.out.println("Velocity " + velocity + " direction " + direction);
        move(velocity, direction);
    }

    @Override
    public void stop(){
        stop();
    }
}
