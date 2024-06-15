/*
Rene Gonzalez
COP2800
Programming Challenge 11

Description: This program first prompts the user to enter a year as an int value and checks if it is a leap year.

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
*/
import java.util.Scanner;


public class ProgramChallenge11 {
       public static void main(String[] args) {

        // Create the scanner to get the user's input  
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input year
        System.out.print("Enter a year and we will check if it's a leap year: "); 
        int year = scanner.nextInt();

        // Checking for leap year
        boolean leap = false;

                if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                leap = true;
            }
        }

        // Output of the result
        if (leap) {
            System.out.print( year + " is a leap year.");
        } 
        else {
            System.out.print( year + " is NOT a leap year.");
        }            
                
        // Close the scanner
        scanner.close();
    }


}