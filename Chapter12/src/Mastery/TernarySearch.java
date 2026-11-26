package Mastery;
/*
 * TernarySearch application
 * Tests the ternarySearch() method.
 */

import java.util.Scanner;

public class TernarySearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {2, 5, 8, 12, 16, 20, 24, 28, 32};

        int searchNum;
        int location;

        System.out.print("Enter a number to search for: ");
        searchNum = input.nextInt();

        location = Searches.ternarySearch(
            numbers, 0, numbers.length - 1, searchNum);

        System.out.println("Number at position: " + location);
    }
}
