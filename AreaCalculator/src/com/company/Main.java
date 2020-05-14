package com.company;

//A method named area with one double parameter named radius.
//
//The method needs to return a double value that represents the area of a circle.
//
//If the parameter radius is negative then return -1.0 to represent an invalid value.
//
//Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
//
//The method needs to return an area of a rectangle.
//
//If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
//
//The formula for calculating the area of a rectangle is x * y.
//
//The formula for calculating a circle area is radius * radius * PI.


import static java.lang.Math.PI;

public class Main {
    private static final String INVALID_MESSAGE = "Invalid value";
    public static void main(String[] args) {

        System.out.println(area(5)); // 78.53975
        System.out.println(area(-1)); // -1
        System.out.println(area(5.0, 4.0)); //20
        System.out.println(area(-1.0, 4.0)); //-1
    }

    public static double area(double radius) {
        double area;
        if (radius < 0) {
            area = -1;
        } else {
            area = radius * radius * PI;
        }
        return area;
    }

    public static double area(double x, double y) {
        double area;
        if (x < 0 || y < 0) {
            area = -1;
        } else {
            area = x * y;
        }
        return area;
    }
}
