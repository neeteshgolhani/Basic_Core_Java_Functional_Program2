package com.bridgelabz;
/*The code finds the prime factorization of a given positive integer n using brute force.
 It prompts the user to enter a positive integer, then loops through all integers
 from 2 to the square root of n to find its prime factors. It does this by
 repeatedly dividing n by each prime factor until no more factors of that prime remain,
 then moves on to the next prime factor. If n is still greater than 1 after the loop has completed,
  then n itself is a prime factor and is printed.
 The program outputs all of the prime factors of n as a space-separated list.*/
import java.util.Scanner;

public class PrimeFcator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a new Scanner object to read user input
        // from the console

        // Prompting the user to enter a positive integer N
        System.out.print("Enter a positive integer N: ");
        int n = input.nextInt(); // Reading the user input as an integer

        input.close(); // Closing the Scanner object to release system resources

        // Printing a message to indicate that the prime factors of N will be found
        System.out.print("The prime factors of " + n + " are: ");

        // Finding the prime factors of N using brute force
        for (int i = 2; i*i <= n; i++) { // Looping through all integers from 2 to the square root of N
            while (n % i == 0) { // Checking if i is a factor of N
                System.out.print(i + " "); // Printing i as a prime factor of N
                n /= i; // Dividing N by i to check for more factors of i
            }
        }

        // Handling the case when N itself is a prime number
        if (n > 1) {
            System.out.print(n); // Printing N as a prime factor (since it is greater
            // than 1 and has not been fully divided by the previous loop)
        }
    }
}
