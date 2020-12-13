package de.dumbuya;

import java.util.Arrays;

//A method called reverse() with an int array as a parameter.
//The method should not return any value. In other words, the method is allowed to modify the array parameter.
//In main() test the reverse() method and print the array both reversed and non-reversed.
//To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
// Create a new console project with the name ReverseArrayChallenge
public class Main {

    public static void main(String[] args) {
        int[] numberArray = {1,2,3,4,5};
        int[] numbertwoArray = {10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000};
        int[] countUpAndDown = {1,2,3,4,5,6,7,8,9,10};
        reverse(numberArray);
        reverse(numbertwoArray);
        reverse(countUpAndDown);
        
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = 0;
        for (int i = array.length - 1; i > -1; i--) {
            reversedArray[maxIndex] = array[i];
            maxIndex++;
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }
}
