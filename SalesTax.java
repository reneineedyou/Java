/*
Rene Gonzalez
COP2800
Programming Challenge 4

Description:  Write a program that will ask the user to enter the amount of a purchase. The program should then compute the state and county sales tax. Assume the state sales tax is 4 percent and the county sales tax is 2 percent. The program should display the amount of the purchase, the state sales tax, the county sales tax, the total sales tax, and the total of the sale (which is the sum of the amount of purchase plus the total sales tax). Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.*/ 

import java.util.Scanner;

public class SalesTax {

  public static void main(String[] args) {

    // Create the scanner to get the user's input  
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for the purchase amount
    System.out.print("Enter the amount of purchase: ");
    double purchaseAmount = scanner.nextDouble();

    // Calculations
    double stateTax = purchaseAmount * 0.04;
    double countyTax = purchaseAmount * 0.02;
    double totalAmount = purchaseAmount + stateTax + countyTax;

    // Display the results
    System.out.println("Purchase Amount: " + String.format("%.2f", purchaseAmount));
    System.out.println("State Sales Tax: " + String.format("%.2f", stateTax));
    System.out.println("County Sales Tax: " + String.format("%.2f", countyTax));
    System.out.println("Total Amount: " + String.format("%.2f", totalAmount));

    // Close the scanner
    scanner.close();
  }
}
