package gr.aueb.cf.cf9.exercises.API;

import java.util.Scanner;

/**
 * Exercise: The "smart" car.
 * Uses API from SmartCar class.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartCar car = new SmartCar("Ferrari");
        int choice = 0;

        do{
            printMenu();
            System.out.println("Please choose an option from menu: ");
            choice = scanner.nextInt();

            handleChoice(choice, car, scanner);
        }while(choice != 4);
    }

    /**
     * Prints a menu.
     */
    public static void printMenu(){
        System.out.println("Menu");
        System.out.println("1. Refuel");
        System.out.println("2. Drive");
        System.out.println("3. Details");
        System.out.println("4. Exit");
    }

    /**
     * Handles the user choice.
     * @param choice User choice.
     * @param car Details for the car.
     * @param scanner Passes user entries to variables.
     */
    public static void handleChoice(int choice, SmartCar car, Scanner scanner){
        switch(choice){
            case 1 -> {
                double amount = 0.0;
                System.out.println("Please enter amount for refuel:");
                amount = scanner.nextDouble();
                car.refuel(amount);
            }

            case 2 -> {
                int distance = 0;
                System.out.println("Please enter distance for drive:");
                distance = scanner.nextInt();
                car.drive(distance);
            }

            case 3 -> System.out.println(car);
            case 4 -> System.out.println("Exit...");
            default -> System.out.println("Invalid choice. Please choose a valid option.");
        }
    }
}