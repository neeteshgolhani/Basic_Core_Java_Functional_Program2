package com.bridgelabz;
/* the program calculates the sum of the series 1/1 + 1/2 + 1/3 + ... + 1/N,
where N is the user input integer. It then prints the result as the Nth harmonic number.
 If the user enters 0 as the input integer,
 the program prints an error message and terminates without performing any calculations.*/
import java.util.Scanner;
/*The program takes an input integer n from the user using the Scanner class.
It checks if n is zero, and prints an error message if it is. The program then terminates.
A variable sum is initialized to 0.
A for loop is used to calculate the sum of the harmonic series from 1 to n.
 The loop iterates from 1 to n, adding the reciprocal of the loop counter to sum on each iteration.
Finally, the program prints the value of sum as the Nth harmonic number.
*/

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a new Scanner object to read user input from the console

        // Prompting the user to enter a positive integer N
        System.out.print("Enter a positive integer N: ");

        int n = input.nextInt(); // Reading the user input as an integer

        input.close(); // Closing the Scanner object to release system resources

        // Checking if N is equal to 0, if so printing an error message and terminating the program
        if (n == 0) {
            System.out.println("Error: N cannot be zero.");
            return;
        }

        double sum = 0; // Initializing a double variable sum to hold the sum of the harmonic series

        // Calculating the sum of the harmonic series from 1 to N using a for loop
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Adding the reciprocal of the loop counter i to sum on each iteration
        }

        // Printing the value of sum as the Nth harmonic number
        System.out.println("The " + n + "th harmonic number is " + sum);
    }
}