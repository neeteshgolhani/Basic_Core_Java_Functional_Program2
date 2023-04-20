package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;
/* This program prompts the user to enter the number of times to flip a coin,
reads the input using a scanner object, checks if the input is positive,
and then simulates flipping a coin that many times. For each flip,
it generates a random number between 0 and 1 using a random number
generator object and checks whether it's less than 0.5. If it is,
the program considers it a "tails" flip; otherwise, it considers it a "heads" flip.
It then calculates and prints the percentages of heads and tails flips.*/

public class FlipCoin {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // prompt user to enter number of times to flip the coin
        System.out.println("Enter the number of times to flip the coin");

        // read user input and store it in variable numFlip
        int numFlip = sc.nextInt();

        // check if numFlip is less than or equal to 0
        if (numFlip <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // close the scanner object
        sc.close();

        // create a random number generator object
        Random rand = new Random();

        // initialize variables to count number of heads and tails
        int headFlip = 0;
        int tailFlip = 0;

        // flip the coin numFlip times
        for (int i = 0; i < numFlip; i++) {
            if (rand.nextDouble() < 0.5) {
                tailFlip++; // if random number is less than 0.5, it's tails
            } else {
                headFlip++; // otherwise, it's heads
            }
        }

        // calculate percentages of heads and tails
        double percentHeads = (double) headFlip / numFlip * 100;
        double percentTails = (double) tailFlip / numFlip * 100;

        // print the results
        System.out.println("Percentage of heads: " + percentHeads);
        System.out.println("Percentage of tails: " + percentTails);
    }
}