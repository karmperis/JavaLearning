package gr.aueb.cf.cf9.exercises.Strings;

import java.util.Scanner;

/**
 * Exercise: Length detector
 */
public class LengthDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LENGTH_LIMIT = 10;
        String word = "";

        System.out.println("Please enter the word for length detection: ");
        word = scanner.nextLine();

        if (word.length() > LENGTH_LIMIT){
            System.out.println("The word is longer than 10 characters.");
        } else{
            System.out.println("The word is shorter than 10 characters.");
        }
    }
}