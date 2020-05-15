package com.company;

public class Main {
//A method called isOdd with an int parameter and call it number. The method needs to return a boolean.
//
//Check that number is > 0, if it is not return false.
//
//If number is odd return true, otherwise  return false.
//
//A second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//
//The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
//
//It should call the method isOdd to check if each number is odd.
//
//The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
//
//If those conditions are not satisfied return -1 from the method to indicate invalid input.

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100)); // 2500
        System.out.println(sumOdd(-1, 100)); // -1
        System.out.println(sumOdd(100, 100)); // 0
        System.out.println(sumOdd(13, 13)); // 13
        System.out.println(sumOdd(100, -100)); // -1
        System.out.println(sumOdd(100, 1000)); // 247500
    }

    public static boolean isOdd(int number) {
        boolean isOdd;
        if (number < 0) {
            isOdd = false;
        } else isOdd = number % 2 != 0;
        return isOdd;
    }

    public static int sumOdd(int start, int end) {
        int sumOdd = 0;
        if (end < start || start < 0) {
            sumOdd = -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOdd += i;
                }
            }
        }
        return sumOdd;
    }
}
