package com.bridgelabz;

import java.util.Scanner;
/*The code prompts the user to enter a character, reads the input as a string
extracts the first character and stores it in a character variable ch.
It then checks whether the character is a vowel or a consonant by
comparing it to a list of possible vowels (both uppercase and lowercase).
If the character is a vowel, it prints a message indicating that it is a vowel.Otherwise,
it prints a message indicating that it is a consonant.*/
public class VowelConsonant {
    public static void main(String[] args) {
        char ch; // Declare character variable
        Scanner input = new Scanner(System.in); // Create Scanner object to read input

        System.out.print("Enter a character: "); // Prompt user to enter a character
        ch = input.next().charAt(0); // Read the user input as a string and extract the first character, then store in ch variable

        // check if the character is a vowel or a consonant
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { // Check if the character is a vowel
            System.out.println(ch + " is a vowel."); // Print message indicating that the character is a vowel
        }
        else {
            System.out.println(ch + " is a consonant."); // Print message indicating that the character is a consonant
        }
    }
}