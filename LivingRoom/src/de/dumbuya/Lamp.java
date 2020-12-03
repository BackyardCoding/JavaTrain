package de.dumbuya;

public class Lamp {
    private int numberOfLightBulbs;
    private boolean isOn;

    public Lamp(int numberOfLightBulbs, boolean isOn) {
        this.numberOfLightBulbs = numberOfLightBulbs;
        this.isOn = isOn;
    }

    public void turnLightOn() {
        isOn = true;
        System.out.println("The light is on.");
    }

    public void turnLightOff() {
        isOn = false;
        System.out.println("The light is off");
    }
    public int getNumberOfLightBulbs() {
        return numberOfLightBulbs;
    }

    public boolean isOn() {
        return isOn;
    }
}
