package gr.aueb.cf.cf9.exercises.Strings;

/**
 * Reverse a string using for loop.
 */
public class ReverseString {
    public static void main(String[] args) {
        String word = "Television";

        // traverse
        for(int i = 0; i < word.length(); i++){
            System.out.print(word.charAt(i) + " ");
        }

        System.out.println();

        // reverse
        for(int j = word.length()-1; j >= 0; j--){
            System.out.print(word.charAt(j) + " ");
        }
    }
}