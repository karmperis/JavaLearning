package gr.aueb.cf.cf9.exercises.Arrays;

/**
 * Reverse an array using for loop
 */
public class ReverseArray {
    public static void main(String[] args) {
        int [] ages = {47, 22, 19, 15, 65};

        // traverse for-each loop
        System.out.print("Ages: ");
        for(int age : ages){
            System.out.print(age + " ");
        }

        System.out.println();

        // reverse for loop
        System.out.print("Reverse, ages: ");
        for(int i = ages.length - 1; i >= 0; i--){
            System.out.print(ages[i] + " ");

        }
    }
}