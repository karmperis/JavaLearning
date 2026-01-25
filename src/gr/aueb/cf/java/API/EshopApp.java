package gr.aueb.cf.cf9.exercises.API;

/**
 * Main using class Product API.
 */

import java.util.Scanner;

public class EshopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int amount = 0;

        Product keyboard = new Product("Keyboard",50.0, 10);

        do{
            printMenu();
            System.out.println("Please make a choice: ");
            choice = scanner.nextInt();

            if(choice < 3) {
                System.out.println("Please enter the amount: ");
                amount = scanner.nextInt();
            }
            userChoice(choice, amount, keyboard);

        }while(choice != 4);

    }

    public static void printMenu(){
        System.out.println("Menu");
        System.out.println("1. Sale");
        System.out.println("2. Purchase");
        System.out.println("3. Report");
        System.out.println("4. Exit");
    }

    public static void userChoice(int choice, int amount, Product keyboard){

        switch (choice){
            case 1 -> keyboard.sell(amount);
            case 2 -> keyboard.restock(amount);
            case 3 -> System.out.println(keyboard.productToString());
            case 4 -> System.out.println("Exit...");
            default -> System.out.println("Please make a right choice." );
        }
    }
}