/*
Rene Gonzalez
COP2800
Programming Challenge 1

Description:  Write a program that asks the user for a number representing seconds and obtains hours and minutes from the seconds.
*/ 

import java.util.Scanner;

public class TimeConverter{

  public static void main(String[] args) {

  //creates the scanner to get the users input  
  Scanner scanner = new Scanner(System.in);
    
  System.out.print("Enter the number of seconds:");
  int totalSeconds = scanner.nextInt();

  //calculations
  int hours = totalSeconds / 3600;
  int remainingSeconds = totalSeconds % 3600;
  int minutes = remainingSeconds / 60;
  int seconds = remainingSeconds % 60;

  //displays the results
  System.out.println("Number of hours: " + hours);
  System.out.println("Number of minutes: " + minutes);
  System.out.println("Number of seconds: " + seconds);

  // Close the scanner
  scanner.close();

  }

}