/*
Rene Gonzalez
COP2800
Programming Challenge 5

Description: A car's miles-per-gallon (MPG) can be calculated with the following formula:
MPG = Miles driven / Gallons of gas used
Write a program that asks the user for the number of miles driven and the gallons of gas used. It should calculate the car's miles-per-gallon and display the result on the screen.  

*/ 

import java.util.Scanner;

public class mpgCalculator {

  public static void main(String[] args) {

    // Create the scanner to get the user's input  
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for the purchase amount
    System.out.print("Enter the amount of miles driven: ");
    double milesDriven = scanner.nextDouble();

    // Prompt the user for the purchase amount
    System.out.print("Enter the amount of gallons used: ");
    double gallonsUsed = scanner.nextDouble();


    // Calculations
    double mpg = milesDriven / gallonsUsed;
    
    // Display the results
    System.out.println("Miles Per Gallon: " + String.format("%.2f", mpg));
  
    // Close the scanner
    scanner.close();
  }
}