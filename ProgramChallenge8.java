/*
Rene Gonzalez
COP2800
Programming Challenge 8

Description: Write a program that randomly generates 
a lottery of a two-digit number, prompts the user to 
enter a two-digit number, and determines whether the 
user wins according to the following rule:

If the digits in the user input matches the lottery in exact order, the award is $10,000.
If the digits in the user input matches the lottery backwards, the award is $3,000.
If one digit in the user input matches a digit in the lottery, the award is $1,000.
*/
import java.util.Scanner;
import java.util.Random;

public class ProgramChallenge8 {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number between 00 and 99
        int randomNumber = random.nextInt(100);

        // Format the number to ensure it has two digits
        String formattedNumber = String.format("%02d", randomNumber);

        // Create the scanner to get the user's input  
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Guess a two-digit number between 00-99: "); 
        int userInput = scanner.nextInt();

        // Format the user number to ensure it has two digits
        String formattedInput = String.format("%02d", userInput);

        // Print the formatted random number
        System.out.println("Random number (00-99): " + formattedNumber);
        // Print the formatted random number
        System.out.println("user number (00-99): " + formattedInput);

       
        
    }

    
}
