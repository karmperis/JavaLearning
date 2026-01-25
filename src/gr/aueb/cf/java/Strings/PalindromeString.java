package gr.aueb.cf.cf9.exercises.Strings;

/**
 * Checks if a word is palindrome using StringBuilder.
 */
public class PalindromeString {
    public static void main(String[] args) {
        String word = "ANNA";

        StringBuilder sb = new StringBuilder(word);
        boolean isPalindrome = sb.reverse().toString().equals(word);

        if(isPalindrome) {
            System.out.printf("The word %s is palindrome.", word);
        } else {
            System.out.printf("The word %s is not palindrome.", word);
        }
    }
}