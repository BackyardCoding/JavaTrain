package de.dumbuya;
// This program demonstrates the concept of composition.
//The example of a computer is used.
public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20,5);
        Case theCase = new Case("229B","Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus", 4, 6, "v2.44");

        PC thePc = new PC(theCase, theMonitor, theMotherboard);
        thePc.powerUp();
    }
}
