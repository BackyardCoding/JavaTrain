package com.company;

//A simple program to convert km per hour to miles per hour
//The program has two methods.
//The method toMilesPerHour does the conversion.
//The method printConversion does the conversion and print the output in a specific format.

public class Main {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);

    }

    public static long toMilesPerHour(double kilometresPerHour) {

        long milesPerHour;
        if(kilometresPerHour<0) {
            milesPerHour = -1;
        } else {
            milesPerHour = Math.round((kilometresPerHour / (1.609)));
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = Math.round((kilometersPerHour / (1.609)));
            System.out.println(kilometersPerHour+ " km/h = " + milesPerHour + " mi/h");
        }
    }
}
