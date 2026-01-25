package gr.aueb.cf.cf9.exercises.Arrays;

/**
 * Print an array using method.
 */
public class PrintArrayWithMethod {
    public static void main(String[] args) {
        int [] numbers = {12, 19, 43, 54, 46, 120};
        int [] ages = {47, 22, 19, 15, 65, 12};

        System.out.print("Numbers: ");
        printArray(numbers);
        System.out.print("Ages: ");
        printArray(ages);
    }

    /**
     * Traverse an array.
     * @param numbers Array
     */
    public static void printArray(int [] numbers){
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}