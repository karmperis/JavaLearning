package gr.aueb.cf.cf9.exercises.Strings;

import java.util.Scanner;
/**
 * Exercise: The User Profile Generator.
 */
public class TheUserProfileGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = " ";
        String [] tokens;
        int year = 0;
        final int CURRENT_YEAR = 2025;

        // 1. Input & Cleaning: "  Nikos,Papadopoulos,1995    "
        System.out.println("Please enter user information: ");
        user = scanner.nextLine().trim();

        System.out.println();

        System.out.println("Trim: " + user);

        System.out.println();

        // 2. Parsing (Split)
        System.out.println("Split: ");
        tokens = user.split(",");
        for(String token : tokens){
            System.out.println(token);
        }

        System.out.println();

        // 3. Validation & Conversion
        year = Integer.parseInt(tokens[2]);
        System.out.println("Calculate age: " + (CURRENT_YEAR - year));
        System.out.println("Convert to string: " + String.valueOf(year));

        System.out.println();

        // 4. Processing
        String upperFirstName = tokens[0].toUpperCase();
        String lowerLastName = tokens[1].toLowerCase();

        System.out.println("First name: " + upperFirstName);
        System.out.println("Last name: " + lowerLastName);

        System.out.println();

        // 5. Analysis
        System.out.println("Index of o: " + lowerLastName.indexOf('o'));
        System.out.println("The name starts with \"NI\" : " + upperFirstName.startsWith("NI"));

        System.out.println();

        // 6. Password Generation
        StringBuilder sb = new StringBuilder();

        sb.append(tokens[0].substring(0, 2));
        sb.append(tokens[2]);

        StringBuilder reverseLastName = new StringBuilder(lowerLastName);
        sb.append(reverseLastName.reverse());

        System.out.println("Password: " + sb);

        System.out.println();

        // 7. Final Output
        System.out.printf("\"User [%s %s] confirmed. Password: [%s]\"\n", tokens[0], tokens[1], sb);
    }
}