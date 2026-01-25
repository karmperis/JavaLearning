package gr.aueb.cf.cf9.exercises.Arrays;

/**
 * Deep copy an array using for loop
 */
public class DeepCopyArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 200, 45, 23, 40};
        int[] numbers2 = new int[numbers.length];

        // traverse numbers
        System.out.print("Numbers: ");
        for( int number : numbers ) {
            System.out.print(number + " ");
        }
        System.out.println();

        // deep copy numbers to numbers2
        System.out.print("Numbers2: ");
        for(int i = 0; i < numbers.length; i++){
            numbers2[i] = numbers[i];
            System.out.print(numbers2[i] + " ");
        }
    }
}