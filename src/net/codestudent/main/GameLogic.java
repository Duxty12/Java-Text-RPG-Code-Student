package net.codestudent.main;

import java.util.Scanner;

public class GameLogic {
    static Scanner sc = new Scanner(System.in);

    // Method to get user input from user
    public static int readInt(String prompt, int userChoices) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(sc.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    // Method to stimulate clearing out the console
    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    // Method to print a separator with length n
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    // Method to print a heading
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    // Method to stop the game until user enters anything
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        sc.next();
    }


}
