/******************************************************************************

Simple Temperature Converter that converst between Celcius, Fahrenheit, and Kelvin

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Celcius=1; Farenheit=2; Kelvin=3");
        System.out.println("Please enter the input unit (select 1, 2, or 3): ");
        int input = scanner.nextInt();

        System.out.println("Please enter the output unit (select 1, 2, or 3): ");
        int output = scanner.nextInt();

        System.out.println("Please enter the value to be converted: ");
        double value = scanner.nextDouble();

        double convertedValue = convertTemperature(input, output, value);
        System.out.println("The converted value is: " + convertedValue);

        // Close the scanner
        scanner.close();
    }

    public static double convertTemperature(int inputUnit, int outputUnit, double value) {
        if (inputUnit == outputUnit) {
            return value;
        } else if (inputUnit == 1 && outputUnit == 2) {
            return celsiusToFahrenheit(value);
        } else if (inputUnit == 1 && outputUnit == 3) {
            return celsiusToKelvin(value);
        } else if (inputUnit == 2 && outputUnit == 1) {
            return fahrenheitToCelsius(value);
        } else if(inputUnit==2 && outputUnit==3){
            return farenheitToKelvin(value);
        }else if(inputUnit==3 && outputUnit==1){
            return kelvinToCelcius(value);
        }else if(inputUnit==3 && outputUnit==2){
            return kelvinToFarenheit(value);
        }else {
            System.out.println("Unsupported conversion.");
            return 0.0;
        }
    
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * (9.0 / 5.0) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
    
    public static double farenheitToKelvin(double fahrenheit){
        return (fahrenheit-32)*(5.0/9.0)+273.15;
    }
    
    public static double kelvinToCelcius(double kelvin){
        return kelvin-273.15;
    }
    
    public static double kelvinToFarenheit(double kelvin){
        return (kelvin-273.15)*(9.0/5.0)+32;
    }
}