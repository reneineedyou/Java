/*
Rene Gonzalez
COP2800
Programming Challenge 3

Description:  This program lets the user enter the amount as an integer representing cents and output a report listing the monetary equivalent in single dollars, quarters, dimes, nickels, and pennies. Your program should report maximum number of dollars, then the maximum number of quarters, dimes and so on, in that order.
*/ 

import java.util.Scanner;

public class CentsConverter{

  public static void main(String[] args) {

  //creates the scanner to get the users input  
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter the cents as an integer:");
  int totalCents = scanner.nextInt();

  //calculations
  int dollars = totalCents / 100; 
  int remainingCents = totalCents % 100;
  int quarters = remainingCents / 25;
  remainingCents = remainingCents % 25;
  int dimes = remainingCents / 10;
  remainingCents = remainingCents % 10;  
  int nickels = remainingCents / 5;      
  int pennies = remainingCents % 5;
  
  //displays the results
  System.out.println("Dollars: " + dollars);
  System.out.println("Quarters: " + quarters);
  System.out.println("Dimes: " + dimes);
  System.out.println("Nickels: " + nickels);
  System.out.println("Pennies: " + pennies);
    
  }

}