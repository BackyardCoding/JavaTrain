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
        //Printer 1
        System.out.println("Printer 1:");
        Printer printer = new Printer(50,0,false);
        printer.printPage(2);
        System.out.println("Pages printed in total: " + printer.getPagesPrinted());
        printer.printPage(4);
        System.out.println("Pages printed in total: " + printer.getPagesPrinted());
        System.out.println();
        //Printer duplex
        Printer printerD = new Printer(50,0,true);
        printerD.printPage(2);
        System.out.println("Pages printed in total: " + printerD.getPagesPrinted());
        printerD.printPage(4);
        System.out.println("Pages printed in total: " + printerD.getPagesPrinted());

    }

}
