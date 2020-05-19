package com.company;
//
///       A method named printSquareStar with one parameter of type int named number.
//        If number is < 5, the method should print "Invalid Value".
//        The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
//
//        EXAMPLE 1
//
//        printSquareStar(5); should print the following:
//
//        *****
//        ** **
//        * * *
//        ** **
//        *****

//        Explanation:
//        *****   5 stars
//        ** **   2 stars space 2 stars
//        * * *   1 star space 1 star space 1 star
//        ** **   2 stars space 2 stars
//        *****   5 stars
//
//
//        EXAMPLE 2
//
//        printSquareStar(8); should print the following:
//
//        ********
//        **    **
//        * *  * *
//        *  **  *
//        *  **  *
//        * *  * *
//        **    **
//        ********
//
//        The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):
//


public class Main {

    private static String INVALID_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
	// write your code here
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(-5);
        printSquareStar(16);
        printSquareStar(100);
    }

    public static void printSquareStar(int number) {
        int columnNumber;
        int rowCount = number;
        int currentRow = 0;
        if (number > 4) {
            for (currentRow = 0; currentRow < rowCount; currentRow++) {
                if (currentRow == 0 || currentRow == rowCount - 1) {
                    for (columnNumber = 0; columnNumber < rowCount; columnNumber++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    for (columnNumber = 0; columnNumber < rowCount; columnNumber++) {
                        if (columnNumber == 0 || columnNumber == (rowCount - 1) || columnNumber == currentRow || columnNumber == (rowCount - currentRow - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println(INVALID_MESSAGE);
        }
    }
}
