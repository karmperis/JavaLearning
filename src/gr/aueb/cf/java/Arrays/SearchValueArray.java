package gr.aueb.cf.cf9.exercises.Arrays;

import java.util.Scanner;

/**
 * Search for a value in an array.
 */
public class SearchValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 50, 200, 45, 23};
        boolean isFound = false;

        System.out.println("Enter the number to be searched: ");
        int numberToSearch = scanner.nextInt();

        for (int number : numbers) {
            if (number == numberToSearch) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("The number " + numberToSearch + " is found.");
        } else {
            System.out.println("The number " + numberToSearch + " is not found.");
        }
    }
}