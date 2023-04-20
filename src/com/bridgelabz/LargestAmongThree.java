package com.bridgelabz;

import java.util.Scanner;
/*This program prompts the user to enter three numbers,
 reads the input using a scanner object, and
  then compares the numbers to find the largest one.
  It uses a series of if-else statements to determine the largest
   number and prints out a message indicating which number is the largest.
 */
public class LargestAmongThree {
    public static void main(String[] args) {
        // declare variables
        double num1, num2, num3;

        // create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // prompt user to enter the first number
        System.out.print("Enter the first number: ");

        // read user input and store it in variable num1
        num1 = input.nextDouble();

        // prompt user to enter the second number
        System.out.print("Enter the second number: ");

        // read user input and store it in variable num2
        num2 = input.nextDouble();

        // prompt user to enter the third number
        System.out.print("Enter the third number: ");

        // read user input and store it in variable num3
        num3 = input.nextDouble();

        // find the largest number among the three
        if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        }
        else if(num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        }
        else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}
