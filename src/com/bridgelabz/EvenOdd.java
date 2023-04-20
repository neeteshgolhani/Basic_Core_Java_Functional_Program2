package com.bridgelabz;
import java.util.Scanner;
/*The program prompts the user to enter a number,
   reads the input using a scanner object,
   and checks if the number is even or odd using the modulo operator (%).
   If the number is even, it prints a message indicating that it's even;
   if it's odd, it prints a message indicating that it's odd. */
public class EvenOdd {
    public static void main(String[] args) {
        int num; // declare variable num to store user input
        Scanner input = new Scanner(System.in); // create scanner object to read user input from console

        System.out.print("Enter a number: "); // prompt user to enter a number
        num = input.nextInt(); // read the integer entered by user and store it in num variable

        // check if the number is even or odd
        if (num % 2 == 0) { // if num is divisible by 2 with no remainder, it's even
            System.out.println(num + " is even."); // print that num is even
        } else { // otherwise, it's odd
            System.out.println(num + " is odd."); // print that num is odd
        }
    }
}
