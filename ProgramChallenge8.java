/*
Rene Gonzalez
COP280056
Programming Challenge 8

Description: Write a program that randomly generates 
a lottery of a two-digit number, 
prompts the user to enter a two-digit number, 
and determines whether the user wins according to the following rule:

If the digits in the user input matches the lottery in exact order, the award is $10,000.
If the digits in the user input matches the lottery backwards, the award is $3,000.
If one digit in the user input matches a digit in the lottery, the award is $1,000.
*/

import java.util.Scanner;
import java.util.Random;

public class ProgramChallenge8 {

    public static void main(String[] args) {
        // Generate a random number between 0-99
        Random rand = new Random();
        int lotteryNumber = rand.nextInt(100);
        
        // Prompt the user to enter a two-digit number
        Scanner scanner = new Scanner(System.in);
        
        //lines were used for testing purposes
        //System.out.print(lotteryNumber + " is the number..." + "press Enter to pass.");
        //int pass = scanner.nextInt();
        
        //prompts user for a 2 digit number
        System.out.print("Enter a two-digit number 00-99: ");
        int userInput = scanner.nextInt();
        
        // Convert both numbers to strings of 2 digits 
        String lotteryStr = String.format("%02d", lotteryNumber);
        String userStr = String.format("%02d", userInput);
        
        // Determine the award
        int award = 0;
        if (userStr.equals(lotteryStr)) {
            award = 10000;
        } else if (userStr.equals(new StringBuilder(lotteryStr).reverse().toString())) {
            award = 3000;
        } else if (userStr.charAt(0) == lotteryStr.charAt(0) || 
                   userStr.charAt(0) == lotteryStr.charAt(1) || 
                   userStr.charAt(1) == lotteryStr.charAt(0) || 
                   userStr.charAt(1) == lotteryStr.charAt(1)) {
            award = 1000;
        }
        
        // Display the result
        System.out.println("The lottery number is: " + lotteryStr);
        if (award == 10000) {
            System.out.println("Perfect match! You won $10,000!!!");
        } else if (award == 3000) {
            System.out.println("Wow, reverse match!! You won $3,000!");
        } else if (award == 1000) {
            System.out.println("Matched 1 digit congrats! You won $1,000!");
        } else {
            System.out.println("Sorry, no match. Better luck next time!");
        }

        scanner.close();
    }
}
