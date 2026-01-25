package gr.aueb.cf.cf9.exercises.Arrays;

/**
 * Sort arrays using bubble sort.
 */
public class BubbleSort {
    public static void main(String[] args) {
        String[] names = {"John", "Mary", "Peter", "Ann", "George"};
        int[] grades = {65, 92, 45, 88, 92};
        int tempGrade = 0;
        String tempName = "";

        for(int i = 0; i < grades.length; i++){ // traverse array
            // Because grades[j+1] -> (grades.length -1)
            // With -i, you're telling it: Every time you finish a round, ignore the end of the board
            // because you already made it.
            for(int j = 0; j < (grades.length -1) - i; j++){

                // We check: Is the current grade smaller than the next one?
                // If so, they should go back (so that the big ones come forward)
                if(grades[j] < grades[j+1]){

                    // EXCHANGE OF GRADES - SWAP
                    tempGrade = grades[j];
                    grades[j] = grades[j+1];
                    grades[j+1] = tempGrade;

                    // EXCHANGE OF NAMES - SWAP
                    tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;
                }
            }
        }

        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}