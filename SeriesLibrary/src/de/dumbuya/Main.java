package de.dumbuya;

import de.math.operations.dumbuya.Series;

/*
This project demonstrates the use of an external self created library, that implements the nSum, factorial
and fibonacci math operations.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Series.nSum(4));
        System.out.println(Series.factorial(4));
        System.out.println(Series.fibonacci(4));
    }
}
