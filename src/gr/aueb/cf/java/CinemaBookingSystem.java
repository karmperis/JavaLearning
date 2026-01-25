package gr.aueb.cf.cf9.exercises;

import java.util.Scanner;

/**
 * Exercise: VIP Cinema Manager 🎬
 * Scenario: You run a small VIP movie theater that only seats 10.
 * You need to create a program that allows the cashier to view seats,
 * make reservations, and cancel tickets.
 */
public class CinemaBookingSystem {
    static Scanner scanner = new Scanner(System.in);
    static char [] seats;
    static boolean isRunning = true;

    public static void main(String[] args) {
        int choice = 0;

        initializeSeats();

        while(isRunning){
            printMenu();
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            getChoice(choice);

            if(!isRunning){
                System.out.println("Exit...");
            }
        }
    }

    /**
     * Populates seats array.
     */
    public static void initializeSeats(){
        seats = new char[10];

        for (int i = 0; i < seats.length; i++) {
            seats[i] = 'O';
        }
    }

    /**
     * Prints a menu.
     */
    public static void printMenu(){
        System.out.println("--- CINEMA BOOKING ---");
        System.out.println("1. Print seats");
        System.out.println("2. Seat booking");
        System.out.println("3. Cancel seat booking");
        System.out.println("4. Revenue calculation");
        System.out.println("5. Exit...");
    }

    /**
     * Gets the user's choice and makes a selection.
     */
    public static void getChoice(int choice){
        switch (choice){
            case 1 -> printSeats(seats);
            case 2 -> bookSeat();
            case 3 -> cancelSeat();
            case 4 -> revenue();
            case 5 -> isRunning = false;
            default -> System.out.println("Invalid choice");
        }
    }

    /**
     * Print seats.
     *
     */
    public static void printSeats(char[] seats){
        for(int i = 0; i < seats.length; i++){
            System.out.print((i+1) + ":" + seats[i] + " ");
        }
        System.out.println();
    }

    /**
     * Performs a booking.
     */
    public static void bookSeat(){
        int seatChoice = 0;

        do {
            System.out.println("Please choose a seat from 1 to 10: ");
            seatChoice = scanner.nextInt();

            if(seatChoice < 1 || seatChoice > 10){
                System.out.println("Invalid choice");

            } else if(seats[seatChoice-1] == 'X'){
                System.out.println("The seat is not available, please choose another one.");

            } else {

                if (seats[seatChoice - 1] == 'O') {
                    System.out.println("The seat is available, booking completed.");
                    seats[seatChoice - 1] = 'X';
                    return;
                }
            }
        }while(seatChoice < 1 || seatChoice > 10);
    }

    /**
     * Performs cancellation.
     */
    public static void cancelSeat(){
        int seatChoice = 0;
        System.out.println("Please input your seat number for cancel: ");
        seatChoice = scanner.nextInt();

        if(seatChoice < 1 || seatChoice > 10){
            System.out.println("Invalid choice");

        } else if(seats[seatChoice-1] == 'X'){
            seats[seatChoice-1] = 'O';
            System.out.println("Your booking is canceled.");

        } else {

            if(seats[seatChoice-1] == 'O') {
                System.out.println("There is no booking to cancel.");
            }
        }
    }

    /**
     * Calculates the revenue.
     */
    public static void revenue(){
        double price = 15.0;
        double count = 0.0;

        for(char seat : seats) {
            if(seat == 'X'){
                count++;
            }
        }
        count *= price;
        System.out.printf("Your revenue: %.2f\n", count);
    }
}