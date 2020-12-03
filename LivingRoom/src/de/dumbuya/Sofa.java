package de.dumbuya;

public class Sofa {
    private int seats;
    private String material;

    public Sofa(int seats, String material) {
        this.seats = seats;
        this.material = material;
    }

    public int getSeats() {
        return seats;
    }

    public String getMaterial() {
        return material;
    }
}
