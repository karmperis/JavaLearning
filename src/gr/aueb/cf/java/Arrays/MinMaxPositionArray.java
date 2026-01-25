package gr.aueb.cf.cf9.exercises.Arrays;

/**
 * Min and max position in an array using for loop
 */
public class MinMaxPositionArray {
    public static void main(String[] args) {
        int [] ages = {47, 82, 19, 15, 65, 12, 22, 9};

        // Min position
        int minPosition = 0;
        int minValue = ages[minPosition];

        for(int i = 1; i < ages.length; i++){
            if(ages[i] < minValue){
                minPosition = i;
                minValue = ages[minPosition];
            }

        }
        System.out.printf("Min position: %d, Age: %d", minPosition, minValue);

        System.out.println();

        // Max position
        int maxPosition = 0;
        int maxValue = ages[maxPosition];

        for(int i = 1; i < ages.length; i++){
            if(ages[i] > maxValue){
                maxPosition = i;
                maxValue = ages[maxPosition];
            }
        }
        System.out.printf("Max position: %d, Age: %d", maxPosition, maxValue);
    }
}