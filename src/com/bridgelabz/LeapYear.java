package com.bridgelabz;

import java.util.Scanner;
/*This program prompts the user to enter a year (4 digits),
   reads the input using a scanner object, and checks
   if the year is a leap year or not. It uses a combination of if-else statements
   and mathematical operations to determine if the year is a leap year,
   and prints out a message indicating whether the year is a leap year or not.
   If the user enters an invalid year (i.e. not a 4-digit number),
   the program prints an error message and exits.
*/
public class LeapYear {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // prompt user to enter a year (4 digits)
        System.out.print("Enter a year (4 digits): ");

        // read user input and store it in variable year
        int year = sc.nextInt();

        // close the scanner object to release resources
        sc.close();

        // check if the year is a valid 4-digit number
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a valid 4-digit year.");

            // return to exit the program if the year is invalid
            return;
        }

        // check if the year is a leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}





