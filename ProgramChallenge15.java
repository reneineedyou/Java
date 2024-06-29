/*
Rene Gonzalez
COP2800
Programming Challenge 14

Description: Suppose that the tuition for a university is 
$10,000 this year and tuition increases 7% every year. 
Write a program that calculates in how many years the tuition 
will be doubled. Use For loops
*/

import java.util.Scanner;

public class ProgramChallenge15 {

    public static void main(String[] args) {

        // Creates the scanner to get the user's input
        Scanner scanner = new Scanner(System.in);

        //prompts user to enter the initial tuition amount
        System.out.print("Enter tuition amount: ");
        double tuition = scanner.nextDouble();

        //prompts user to enter a percent value of increase for each year
        System.out.print("Enter increase percentage rate amount: ");
        double percentRate = scanner.nextDouble();


        //establishes the target double tuition for our loop to stop
        double targetTuition = tuition * 2;
        //converts the percent increase to a multiplier
        double increase = 1 + (percentRate / 100);
        int years = 0;
        //converts double variable percentRate to int for later output
        int percent = (int)percentRate;
        //converts double variable tuition to int for later output
        int initialTuition = (int)tuition;

        while (tuition < targetTuition){
            tuition *= increase;
            years += 1;
        }

        System.out.printf("Increasing %d percent yearly, this $%d initial tuition will be double in %d years.\n", percent, initialTuition, years);

        scanner.close();
    }
}
