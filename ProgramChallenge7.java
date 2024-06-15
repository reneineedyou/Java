/*
Rene Gonzalez
COP2800
Programming Challenge 7

Description: Write a program that prompts the user 
to enter a year and displays the animal for the year.
*/

import java.util.Scanner;

public class ProgramChallenge7 {
    public static void main(String[] args) {
        // Create the scanner to get the user's input  
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter an integer: "); 
        int userInput = scanner.nextInt();

        int x = userInput % 12;

        // Display the animal for the year
        switch (x) {
            case 0:
            System.out.println("Monkey");
            break;
            
            case 1:
            System.out.println("Rooster");
            break;

            case 2:
            System.out.println("Dog");
            break;

            case 3:
            System.out.println("Pig");
            break;

            case 4:
            System.out.println("Rat");
            break;

            case 5:
            System.out.println("Ox");
            break;

            case 6:
            System.out.println("Tiger");
            break;

            case 7:
            System.out.println("Rabbit");
            break;

            case 8:
            System.out.println("Dragon");
            break;

            case 9:
            System.out.println("Snake");
            break;

            case 10:
            System.out.println("Horse");
            break;

            case 11:
            System.out.println("Sheep");
            break;
           
        }

        // Close the scanner
                scanner.close();
    }

}
