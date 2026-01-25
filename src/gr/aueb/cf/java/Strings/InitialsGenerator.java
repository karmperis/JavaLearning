package gr.aueb.cf.cf9.exercises.Strings;

/**
 * Initials generator. Prints the initials of the full name.
 */
public class InitialsGenerator {
    public static void main(String[] args) {
        String fullName = "Nikolaos Karmperis";

        System.out.print(fullName.charAt(0) + " ");
        System.out.println(fullName.charAt(fullName.indexOf(" ") + 1));
    }
}