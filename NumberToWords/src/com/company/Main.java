package com.company;
//A method called numberToWords with one int parameter named number.
//
//The method should print out the passed number using words for the digits.
//
//If the number is negative, print "Invalid Value".
//
//To print the number as words, follow these steps:
//
//1. Extract the last digit of the given number using the remainder operator.
//2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//3. Remove the last digit from the number.
//4. Repeat Steps 2 through 4 until the number is 0.
//
//The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
//
//The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
//
//Use the method reverse within the method numberToWords in order to print the words in the correct order.
//
//Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
//
//The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
//For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
public class Main {
    private static String INVALID_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDigitCount(0)); //1
        System.out.println(getDigitCount(123)); //3
        System.out.println(getDigitCount(-12)); //-1
        System.out.println(getDigitCount(5200)); //4
        System.out.println();
        System.out.println(reverse(-121)); //-121
        System.out.println(reverse(2121)); //1212
        System.out.println(reverse(4321)); //1234
        System.out.println(reverse(1)); //1
        System.out.println();
        numberToWords(123); //one two three
        System.out.println();
        numberToWords(1010); //one zero one zero
        System.out.println();
        numberToWords(1000); //one zero zero zero
        System.out.println();
        numberToWords(-12); //Invalid Value
    }

    public static void numberToWords(int number) {
        int digit;
        int getDigitCount = getDigitCount(number);
        number = reverse(number);
        int getDigitCountReversed = getDigitCount(number);
        if (number < 0 || getDigitCount == -1) {
            System.out.println(INVALID_MESSAGE);
        } else {
            do {
                if (number == 0 && getDigitCount > getDigitCountReversed) {
                    digit = 0;
                    getDigitCount--;
                } else {
                    digit = number % 10;
                    number /= 10;
                }
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            } while (number > 0 || getDigitCount > getDigitCountReversed);
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int getDigitCount;
        if (number < 0) {
            number *= -1;
            getDigitCount = getDigitCount(number);
            while (getDigitCount > 0){
                reverse += (number % 10);
                number /= 10;
                getDigitCount--;
                if (getDigitCount != 0) {
                    reverse *= 10;
                }
            }
            reverse *= -1;
        } else {
            getDigitCount = getDigitCount(number);
            while (getDigitCount > 0){
                reverse += (number % 10);
                number /= 10;
                getDigitCount--;
                if (getDigitCount != 0) {
                    reverse *= 10;
                }
            }
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int getDigitCount = 0;
        if (number < 0) {
            getDigitCount = -1;
        } else {
            do {
                number /= 10;
                getDigitCount++;
            } while (number > 0);
        }
        return getDigitCount;
    }
}
