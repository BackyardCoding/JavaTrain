package de.dumbuya;
//A method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//A method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
// main() method reads the count from the console and call the method readIntegers() with the count parameter.
//
//Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//Finally, print the minimum element in the array.
//
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 5 integer!");
        int[] input = readIntegers(5);
        System.out.println("The minimum value is " + findMin(input));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
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
