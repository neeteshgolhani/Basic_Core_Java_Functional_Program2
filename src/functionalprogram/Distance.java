package functionalprogram;
/*This program takes two integer command-line arguments x and y and calculates
the Euclidean distance from the point (x, y) to the origin (0, 0) using the
formula distance = sqrt(x*x + y*y). It then prints the result to the console.
The Math.pow() function is used to calculate the squares of x and y, and
the Math.sqrt() function is used to calculate the square root of the sum of the squares.
The parseInt() method is used to convert the command-line arguments from strings to integers.
*/
public class Distance {
    public static void main(String[] args) {
        // read in two integer command-line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // calculate the Euclidean distance from (x, y) to (0, 0)
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // print the result
        System.out.println("The Euclidean distance from (" + x + ", " + y + ") to (0, 0) is " + distance);
    }
}
