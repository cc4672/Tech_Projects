/******************************************************************************
Simple BMI calculator
Calls the method calculator_BMI(), which asks the user to input height (in meter)
and the weight (in kg), which will calculate the BMI and interpret the result

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bmi = calculate_BMI();
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));

        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi >= 30) {
            System.out.println("You are obese");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("You are healthy");
        } else {
            System.out.println("You are overweight");
        }
    }

    static double calculate_BMI() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.println("Please enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);

        return bmi;
    }
}

    
