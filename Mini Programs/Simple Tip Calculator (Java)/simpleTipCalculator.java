/******************************************************************************

A simple program to calculate the tip and return the final value.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Please enter a number value greater than 0: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double amountBeforeTip = Double.parseDouble(input);

        System.out.println("Amount before tip: " + amountBeforeTip);

        // Store the final amount returned by calculateTip
        double finalAmount = calculateTip(amountBeforeTip);

        // Display the final amount in the main method
        System.out.println("The final amount including tip is: " + finalAmount);
    }

    public static double calculateTip(double a) {
        System.out.println("Please enter a number value as the % tip: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double tipPercentage = Double.parseDouble(input);

        // Calculate the tip amount and add it to the original amount
        double tipAmount = (a * tipPercentage) / 100;
        double finalAmount = a + tipAmount;

        //System.out.println("Tip amount is: " + tipAmount);

        // Return the final amount to the caller
        return finalAmount;
    }
}
