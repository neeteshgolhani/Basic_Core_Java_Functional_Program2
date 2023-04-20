package com.bridgelabz;
/*This program takes one integer argument from the command line,
        checks if it is valid, and prints the powers of 2 up to that number.
        It uses if-else statements to check if the argument is valid,
        and a for loop to compute and print the powers of 2. If there is an error in the input,
        the program prints an error message and exits using the return statement.*/
public class PowerOf2 {
    public static void main(String[] args) {
        // check if exactly one integer argument is provided
        if (args.length != 1) {
            System.out.println("Please provide one integer argument");

            // return to exit the program if there is an error
            return;
        }

        // parse the integer argument from string to integer
        int n = Integer.parseInt(args[0]);

        // check if the integer is within the allowed range
        if (n < 0 || n >= 31) {
            System.out.println("N must be between 0 and 30");

            // return to exit the program if there is an error
            return;
        }

        // compute and print the powers of 2 up to n
        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}