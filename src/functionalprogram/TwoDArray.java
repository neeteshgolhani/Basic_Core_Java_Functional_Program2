package functionalprogram;

import java.util.Scanner;
/*The code prompts the user to input the number of rows and columns for a 2D array.
It then creates a 2D array with the given number of rows and columns and prompts
 the user to input the elements of the array. It stores the elements in
 the corresponding array indices. Finally, it prints out the 2D array.
 */

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to read input
        System.out.print("Enter the number of rows: "); // Prompt user to enter number of rows
        int rows = input.nextInt(); // Read the user input as integer and store in rows variable
        System.out.print("Enter the number of columns: "); // Prompt user to enter number of columns
        int cols = input.nextInt(); // Read the user input as integer and store in cols variable

        // create the 2D array
        int[][] arr = new int[rows][cols]; // Declare and initialize 2D integer array with rows and cols

        System.out.println("Enter the elements of the array:"); // Prompt user to enter elements of the array
        // read in the elements of the array
        for (int i = 0; i < rows; i++) { // Loop through rows
            for (int j = 0; j < cols; j++) { // Loop through columns
                arr[i][j] = input.nextInt(); // Read the user input as integer and store in corresponding array element
            }

            System.out.println("The 2D array is:"); // Print message indicating that the 2D array will be printed
            // print the elements of the array
            for ( i = 0; i < rows; i++) { // Loop through rows
                for (int j = 0; j < cols; j++) { // Loop through columns
                    System.out.print(arr[i][j] + " "); // Print the value of the corresponding array element followed by a space
                }
                System.out.println(); // Move to the next line after each row is printed
            }
        }
    }
}
