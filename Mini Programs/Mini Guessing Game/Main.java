/******************************************************************************
A simple Java code that guesses a number between 1-100 and outputs 
the number of guesses

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // Generates a random number between 1 and 100
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number between 1-100: ");
        
        int guess;
        int numGuesses = 0;
        
        do {
            guess = input.nextInt();
            numGuesses++;
            
            if (guess > number) {
                System.out.println("Too high");
            } else if (guess < number) {
                System.out.println("Too low");
            }
        } while (guess != number);
        
        System.out.println("Correct!");
        System.out.println("You guessed " + numGuesses + " times.");
        
        input.close(); // Close the Scanner object
    }
}
