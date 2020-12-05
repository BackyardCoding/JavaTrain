package de.dumbuya;
// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.
public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,0,false);
        //System.out.println("Duplex: " + printer.isDuplex());
        printer.printPage(3);

        Printer printerS = new Printer(50,0,true);
        //System.out.println("Duplex: " + printerS.isDuplex());
        printerS.printPage(3);
    }

}
