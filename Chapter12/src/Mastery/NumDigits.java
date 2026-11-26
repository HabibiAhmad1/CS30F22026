package Mastery;
/*
 * NumDigits application
 * Counts the digits in an integer using recursion.
 */

import java.util.Scanner;

public class NumDigits {

    /**
     * Returns the number of digits in a number.
     * pre: number is an integer.
     * post: Number of digits is returned.
     */
    public static int numDigits(int number) {

        if (number >= -9 && number <= 9) {
            return(1);
        } else {
            return(1 + numDigits(number / 10));
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int digits;

        System.out.print("Enter an integer: ");
        number = input.nextInt();

        digits = numDigits(number);

        System.out.println("Number of digits: " + digits);
    }
}
