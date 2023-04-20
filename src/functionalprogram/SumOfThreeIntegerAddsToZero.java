package functionalprogram;
/* This program reads in an array of N integers and finds all distinct triplets of
integers (i, j, k) such that a[i] + a[j] + a[k] = 0. It then outputs the number of distinct triplets found,
 as well as the triplets themselves.
The program does this by using three nested loops to generate all possible triplets in the array,
checking each triplet to see if its sum is zero. If a triplet is found whose sum is zero,
it is printed to the console along with the other distinct triplets that have already been found.
 The number of distinct triplets is counted and output at the end of the program.*/
import java.util.Scanner;

public class SumOfThreeIntegerAddsToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int N = sc.nextInt();
        int[] arr = new int[N]; // create an array to store the integers
        System.out.println("Enter the integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // read in the integers
        }

        int count = 0; // initialize a counter for the number of distinct triplets

        // find the distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
        for (int i = 0; i < N - 2; i++) { // loop through the array up to the 3rd last element
            for (int j = i + 1; j < N - 1; j++) { // loop through the array from the i+1-th element up to the 2nd last element
                for (int k = j + 1; k < N; k++) { // loop through the array from the j+1-th element up to the last element
                    if (arr[i] + arr[j] + arr[k] == 0) { // check if the sum of the current triplet equals 0
                        count++; // increment the counter for the number of distinct triplets found
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]); // print the current triplet
                    }
                }
            }
        }

        // output the number of distinct triplets found
        System.out.println("Number of distinct triplets that sum to 0: " + count);
    }
}
