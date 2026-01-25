package gr.aueb.cf.cf9.exercises.Arrays;

/**
 * Exercise: "The Best Student"
 * Scenario: You are a professor, and you have two tables.
 * One has the Names of the students and the other their Grades.
 * Tasks:
 * 1. Average of the class
 * 2. Find the highest grade
 * 3. If there are two students with the same maximum grade (e.g. 92), print both
 */
public class BestStudentExercise {
    public static void main(String[] args) {
        String[] names = {"John", "Mary", "Peter", "Annie", "George"};
        int[] grades = {65, 92, 45, 88, 92};
        double sum = 0.0;
        double average = 0.0;
        int highestPosition = 0;
        int highestGrade = grades[highestPosition];

        // 1. Average of the class
        for(int grade : grades){
            sum += grade;
        }
        average = sum / grades.length;
        System.out.printf("The average of the class is: %.2f\n", average);

       // 2. Find the highest grade
        for(int i = 1; i < grades.length; i++) {
            if(grades[i] > highestGrade){
                highestPosition = i;
                highestGrade = grades[highestPosition];
            }
        }
        System.out.println("The highest grade is: " + highestGrade);

        // 3. If there are two students with the same maximum grade (e.g. 92), print both
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] == highestGrade){
                System.out.println("Position with highest grade is: " + i + ": " + names[i]);
            }
        }
    }
}