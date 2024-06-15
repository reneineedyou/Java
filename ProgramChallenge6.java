/*
Rene Gonzalez
COP2800
Programming Challenge 6

Description: Write a program that prompts the user to enter an integer. 
If the number is a multiple of 5, print Hi Five. 
If the number is divisible by 2, print Hi Even.
*/

import java.util.Scanner;

public class ProgramChallenge6 {
    public static void main(String[] args) {
        // Create the scanner to get the user's input  
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter an integer: "); 
        int userInput = scanner.nextInt();

        // Check if the number is a multiple of 5
        if (userInput % 5 == 0) {
            System.out.println("Hi Five");
        }

        // Check if the number is divisible by 2
        if (userInput % 2 == 0) {
            System.out.println("Hi Even");
        }

        // Close the scanner
        scanner.close();
    }

}

