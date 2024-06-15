/*
Rene Gonzalez
COP2800
Programming Challenge 12

Description: Body Mass Index (BMI) is a measure of health on weight. 
It can be calculated by taking your weight in kilograms and dividing 
by the square of your height in meters. The interpretation of BMI for 
people 16 years or older is as follows:
BMI < 18.5...Underweight
18.5 >= BMI > 24.9...Normal
25 >= BMI > 29.9...Overweight
BMI > 30...Obese
*/

import java.util.Scanner;

public class ProgramChallenge12 {
    public static void main(String[] args) {
        // Create the scanner to get the user's input  
        Scanner scanner = new Scanner(System.in);

        // Ask for user input weight
        System.out.print("Enter weight in kilograms: "); 
        double weight = scanner.nextDouble();

        // Ask for user input weight
        System.out.print("Enter height in meters: "); 
        double height = scanner.nextDouble();

        //calculating Body Mass Index (BMI)
        double BMI = weight /(Math.pow(height,2));

        //outputting the resulting statements
        System.out.print("\nBMI: " + String.format("%.2f", BMI) + "\t");
        
        if (BMI < 18.5) {
            System.out.println("Underweight.");
        } 
        else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Normal.");
        } 
        else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Overweight.");
        } 
        else {
            System.out.println("Obese.");
        }
        
    // Close the scanner
    scanner.close();

    }
    
}
