package gr.aueb.cf.cf9.exercises.Arrays;

/**
 * Traverse an array using for loop and for-each
 */
public class TraverseArray {
    public static void main(String[] args) {

        int [] ages = {47, 22, 19, 15, 65};

        // for loop
        System.out.print("For loop: ");
        for( int i = 0; i < ages.length; i++){
            System.out.print(ages[i] + " ");
        }

        System.out.println();

        // for-each loop
        System.out.print("For-each loop: ");
        for(int age: ages) {
            System.out.print(age + " ");
        }

    }
}