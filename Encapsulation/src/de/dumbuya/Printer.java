package de.dumbuya;

public class Printer {
    private int tonerLeveL;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLeveL, int numberOfPages, boolean duplex) {
        if (tonerLeveL >= 0 && tonerLeveL <= 100) {
            this.tonerLeveL = tonerLeveL;
        } else {
            this.tonerLeveL = 0;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillUpToner() {
        tonerLeveL = 100;
        System.out.println("The toner is filled up to 100 %");
    }

    public int printPage(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pagesToPrint;
        if (pages == 1) {
            System.out.println("A page is printed.");
        } else {
            System.out.println(this.pagesPrinted + " pages are printed.");
        }
        return pagesToPrint;
    }

    public int getTonerLeveL() {
        return tonerLeveL;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
