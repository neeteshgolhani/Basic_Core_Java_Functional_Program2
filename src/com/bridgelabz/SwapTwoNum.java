package com.bridgelabz;
/*This code swaps the values of two integer variables a and b using a temporary variable temp, and
 prints out the values of a and b before and after the swapping process. */

public class SwapTwoNum {
    public static void main(String[] args) {

        // declare two integer variables and assign them initial values
        int a = 10;
        int b = 20;

        // declare an integer variable to hold temporary value
        int temp;

        // print the values of a and b before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // swap the values of a and b using a temporary variable
        temp = a;
        a = b;
        b = temp;

        // print the values of a and b after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}




