package com.company;

//A method named getEvenDigitSum with one parameter of type int called number.
//
//The method should return the sum of the even digits within the number.
//
//If the number is negative, the method should return -1 to indicate an invalid value.

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // 20
        System.out.println(getEvenDigitSum(252)); // 4
        System.out.println(getEvenDigitSum(-22)); // -1
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int digit;
        if (number < 0) {
            sum = -1;
        } else {
            while (number > 0) {
                digit = number % 10;
                number /= 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
            }
        }
        return sum;
    }
}
