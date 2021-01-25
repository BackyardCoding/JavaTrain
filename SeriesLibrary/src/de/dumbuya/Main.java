package de.dumbuya;

import de.math.operations.dumbuya.Series;

/*
This project demonstrates the use of an external self created library, that implements the nSum, factorial
and fibonacci math operations.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("nSum");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("\nFactorial");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("\nFibonacci");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
