package de.dumbuya;

public class Carpet {
    private double length;
    private double width;

    public Carpet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}
