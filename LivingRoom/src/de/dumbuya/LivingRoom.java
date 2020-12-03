package de.dumbuya;

public class LivingRoom {
    private double width;
    private double length;
    private int windows;
    private int doors;

    private Sofa sofa;
    private Television television;
    private Table table;
    private Carpet carpet;
    private Lamp lamp;

    public LivingRoom(double width, double length, int windows, int doors, Sofa sofa, Television television, Table table, Carpet carpet, Lamp lamp) {
        this.width = width;
        this.length = length;
        this.windows = windows;
        this.doors = doors;
        this.sofa = sofa;
        this.television = television;
        this.table = table;
        this.carpet = carpet;
        this.lamp = lamp;
    }

    public double getArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Television getTelevision() {
        return television;
    }

    public Table getTable() {
        return table;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
