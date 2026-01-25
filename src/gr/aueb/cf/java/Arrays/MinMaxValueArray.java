package gr.aueb.cf.cf9.exercises.Arrays;

/**
 *  Find min and max value in an array.
 */
public class MinMaxValueArray {
    public static void main(String[] args) {

        int [] ages = {47, 22, 19, 15, 65, 12};
        int min = ages[0];
        int max = ages[0];

        // traverse array
        System.out.print("Ages: " );
        for(int age : ages){
            System.out.print(age + " ");
        }

        System.out.println();

        // min value
        for(int i = 1; i < ages.length; i++){
            if(ages[i] < min) {
                min = ages[i];
            }
        }
        System.out.print("Min value: " + min);

        System.out.println();

        // max value
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > max) {
                max = ages[i];
            }
        }
        System.out.print("Max value: " + max);
    }
}