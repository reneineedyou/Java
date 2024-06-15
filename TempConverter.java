/*
Rene Gonzalez
COP2800
Programming Challenge 2

Description:  Write a program that asks the user for the current temperature in degrees Fahrenheit and converts it to degrees Celsius using the formula:
celsius = (5/9) * (fahrenheit - 32)
*/ 

import java.util.Scanner;

public class TempConverter {

  public static void main(String[] args) {

  //creates the scanner to get the users input  
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter temperature in Farenheit:");
  float farenheit = scanner.nextFloat();

  //calculation
  float celsius = (5*(farenheit - 32))/9;

  //displays the results
  System.out.println("Temperature in Celsius: " + celsius);

  // Close the scanner
  scanner.close();
  
  }

}