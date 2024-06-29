/*
Rene Gonzalez
COP2800
Programming Challenge 13

Description: Using do-while, loops write a program that randomly generates 
an integer between 0 and 100, inclusive. The program prompts the user to 
enter a number continuously until the number matches the randomly generated 
number. For each user input, the program tells the user whether the input is 
too low or too high, so the user can choose the next input intelligently.
*/

import java.util.Scanner;
import java.util.Random;

public class ProgramChallenge13 {

    public static void main(String[] args) {
        // Generate a random number between 0-100
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);
        int userInput;

        //prompts user to enter a value
        System.out.print("Take a guess at the random number.\n");
        System.out.print("Enter a number 0-100: ");

        //loops until the user enter the matching value
        do {
        //scans users entry to variable userInput.
        userInput = scanner.nextInt();
        
            if (userInput > randomNumber){
                System.out.println("Too high. Try Agian.");
            }
            if (userInput < randomNumber){
                System.out.println("Too low. Try Agian.");
            }
    
        } while (randomNumber != userInput);

        System.out.println("!!!!You got the number!... Good Job!!!!");

        scanner.close();
    }
}
