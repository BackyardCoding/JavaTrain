package com.company;

import java.util.Scanner;
//
//A method called inputThenPrintSumAndAverage that does not have any parameters.
//
//The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//
//When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//
//XX represents the sum of all entered numbers of type int.
//YY represents the calculated average of all numbers of type long.
public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int number = 0, sum = 0; double average;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int input = scanner.nextInt();
                sum += input;
                number++;
            } else {
                average = (double) sum / number;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
