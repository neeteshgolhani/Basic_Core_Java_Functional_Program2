package functionalprogram;
/*
This program reads in the coefficients a, b, and c of the quadratic equation
a*x*x + b*x + c from user input using the Scanner class. It then calculates the
discriminant delta using the formula b*b - 4*a*c.
If the discriminant is greater than zero, the program calculates and prints the
two roots of the equation using the formulae given in the problem statement.
If the discriminant is zero, the program calculates and prints the single root of the equation.
If the discriminant is negative,
the program prints a message indicating that the equation has no real roots.
*/

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        // Read in coefficients a, b, and c from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate discriminant
        double delta = b * b - 4 * a * c;

        // Calculate and print roots
        if (delta > 0) {  // If the discriminant is positive, there are two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);  // Calculate the first root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);  // Calculate the second root
            System.out.println("The roots are " + root1 + " and " + root2);  // Print the roots
        } else if (delta == 0) {  // If the discriminant is zero, there is one real root
            double root = -b / (2 * a);  // Calculate the root
            System.out.println("The root is " + root);  // Print the root
        } else {  // If the discriminant is negative, there are no real roots
            System.out.println("The equation has no real roots.");
        }
    }
}