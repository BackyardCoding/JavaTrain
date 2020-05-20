package com.company;
import java.util.Scanner;

//Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//Before the user enters the number, print the message Enter number:
//If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
public class Main {

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }

                if (number < min){
                    min = number;
                }
            } else {
                System.out.println("Max number is " + max + " the min number is " + min + ".");
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

}
