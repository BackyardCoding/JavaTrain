package de.dumbuya;
//A method called readInteger() that has no parameters and returns an int.
//It needs to read in an integer from the user - this represents how many elements the user needs to enter.
//Another method called readElements() that has one parameter of type int
//The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
//A method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
//The scenario is:
//readInteger() is called.
//The number returned by readInteger() is then used to call readElements().
//The array returned from readElements() is used to call findMin().
//findMin() returns the minimum number.

import java.util.Arrays;
import java.util.Scanner;

//NOTE: Do not add a main method to the solution code.
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please type the number of input values:");
        int count = readInteger();
        int[] array = readElements(count);
        int minValue = findMin(array);
        System.out.println("The minimum value of the array is " + minValue);
    }

    public static int readInteger() {
        int inputValue = scanner.nextInt();
        scanner.nextLine();
        return inputValue;
    }

    public static int[] readElements(int count) {
        int[] array = new int[count];
        System.out.println("Type " + count + " integer.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public static int findMin(int[] array) {
        int[] input = array;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (minValue > input[i]) {
                minValue = input[i];
            }
        }
        return minValue;
    }
}
