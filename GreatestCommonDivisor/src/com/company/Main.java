package com.company;
//A method named getGreatestCommonDivisor with two parameters of type int named first and second.
//
//If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//
//The method should return the greatest common divisor of the two numbers (int).
//
//The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15)); // 5
        System.out.println(getGreatestCommonDivisor(12, 30)); //6
        System.out.println(getGreatestCommonDivisor(9, 18)); //-1
        System.out.println(getGreatestCommonDivisor(81, 153));// 9
        System.out.println(getGreatestCommonDivisor(12, 12));// 12
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int getGreatestCommonDivisor;
        int h;
        int a;
        int b;
        if (first < 10  || second < 10){
            getGreatestCommonDivisor = -1;
        } else {
            if (first > second) {
                a = first;
                b = second;
                do {
                    h = a % b;
                    a = b;
                    b = h;
                } while(b != 0);
                getGreatestCommonDivisor = a;
            } else if (first == second) {
                getGreatestCommonDivisor = first;
            } else {
                a = second;
                b = first;
                do {
                    h = a % b;
                    a = b;
                    b = h;
                } while(b != 0);
                getGreatestCommonDivisor = a;
            }
        }
        return getGreatestCommonDivisor;
    }
}
