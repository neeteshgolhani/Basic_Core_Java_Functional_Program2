package functionalprogram;
/*
The program takes two double command-line arguments t and v which represent
the temperature in Fahrenheit and wind speed in miles per hour, respectively.
The Math.pow() function is used to compute the power of v to 0.16 as per the
formula given by the National Weather Service.
The program also checks if the input values are within the valid range using the given conditions.
If the input values are out of range, the program prints an error message and exits.
If the input values are valid, the program calculates and prints the wind chill using the given formula.
*/
public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        // Check if input values are within valid range
        if (Math.abs(t) > 50 || v < 3 || v > 120) {
            System.out.println("Inputs out of range.");
            return;
        }

        // Calculate wind chill
        double windChill = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));

        System.out.println("Wind chill: " + windChill);
    }
}
