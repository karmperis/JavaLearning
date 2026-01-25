package gr.aueb.cf.cf9.exercises.Strings;

/**
 * Traverse a string using for
 * and for-each loop.
 */
public class TraverseString {
    public static void main(String[] args) {
        String firstname = "Nikolaos";
        String lastname = "Karmperis";

        // for loop
        for(int i = 0; i < firstname.length(); i++){
            System.out.print(firstname.charAt(i) + " ");
        }

        System.out.println();

        // for-each loop
        for(char ch : lastname.toCharArray()){
            System.out.print(ch + " ");
        }

    }
}