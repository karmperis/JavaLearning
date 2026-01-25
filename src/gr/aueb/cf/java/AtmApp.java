package gr.aueb.cf.cf9.exercises;

import java.util.Scanner;

/**
 * Exercise: Create an AtmApp application
 */
public class AtmApp {
    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;
    static double balance = 500.0;

    public static void main(String[] args) {
        while(choice!= 4){
            printMenu();
            choice = scanner.nextInt();
            setChoice();
        }
    }

    /**
     * Prints a menu.
     */
    public static void printMenu(){
        System.out.println("--- ATM MENU ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Balance Inquiry");
        System.out.println("4. Exit");
        System.out.print("Choice: ");
    }

    /**
     * Makes a selection from user input.
     */
    public static void setChoice(){
        switch(choice){
            case 1 -> deposit();
            case 2 -> withdrawal();
            case 3 -> balanceInquiry();
            case 4 -> System.out.println("Exit");
            default -> System.out.println("Invalid choice");
        }
    }

    /**
     * Makes a deposit.
     */
    public static void deposit(){
        double amount = 0.0;

        System.out.println("Please insert amount: ");
        amount = scanner.nextDouble();

        if( amount <= 0.0 ) {
            System.out.println("Deposit amount must be greater than zero");
            return;
        }
        balance += amount;
        System.out.printf("Successful deposit of the amount of %.2f\n", amount);
    }

    /**
     * Makes a withdrawal.
     */
    public static void withdrawal(){
        double amount = 0.0;

        System.out.println("Please insert amount: ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("The amount is not sufficient for withdrawal.");
            return;
        }
        balance -= amount;
        System.out.printf("Successful withdrawal of the amount of %.2f\n", amount);
    }

    /**
     * Shows the current balance.
     */
    public static void balanceInquiry(){
        System.out.println(balance);
    }
}