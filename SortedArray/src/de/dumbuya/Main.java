package de.dumbuya;

import java.util.Arrays;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
public class Main {

    public static void main(String[] args) {
        System.out.println("First we type in the measured velocity values. Type 5 integers.");
        int[] velocity = getIntegers(5);
        System.out.println("Velocity sorted : ");
        printArray(sortArray(velocity));
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temporarilyLargestInteger;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    temporarilyLargestInteger = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temporarilyLargestInteger;
                }
            }

        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {

        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }
}
