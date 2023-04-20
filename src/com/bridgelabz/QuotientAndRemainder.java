package com.bridgelabz;

import java.util.Scanner;
/* This program prompts the user to enter two integers,
   computes the quotient and remainder of their division using integer division and modulus,
   and prints the results to the console.
   It uses a Scanner object to read input from the console and nextInt() method to read integer input,
   and println() method to print output to the console.
   The program closes the Scanner object at the end to free up resources.*/

public class QuotientAndRemainder {
        public static void main(String[] args) {
            // create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            // prompt the user to enter the dividend
            System.out.print("Enter the dividend: ");

            // read the dividend from the console input
            int dividend = scanner.nextInt();

            // prompt the user to enter the divisor
            System.out.print("Enter the divisor: ");

            // read the divisor from the console input
            int divisor = scanner.nextInt();

            // compute the quotient and remainder using integer division and modulus
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            // print the quotient and remainder to the console
            System.out.println("The quotient is: " + quotient);
            System.out.println("The remainder is: " + remainder);

            // close the Scanner object to free up resources
            scanner.close();
        }
}