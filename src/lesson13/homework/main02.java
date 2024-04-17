package lesson13.homework;

import java.util.Scanner;

public class main02 {
    public static double celsiusToFahrenheit(double degrees){
    return degrees * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(double degrees) {
        return (degrees - 32) / 1.8;
    }

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);


        System.out.println("You are welcome in the temperature converter!");

        while (true) {


            System.out.println(" Choose conversion:\n" +
                    " 1. Fahrenheit to Celsius." +
                    " \n 2. Celsius to Fahrenheit. \n"+
                    "0. Exit.");
            int conv;

            while(true) {
                conv = scanner.nextInt();

                if ((conv >= 0 )&& (conv <= 2))
                    break;
            }
            if (conv == 0){
                System.out.println("Good buy!");
                break;
            }else {
                System.out.println("Enter the temperature: ");
                double temp = scanner.nextDouble();

                if (conv == 1) {
                    System.out.println("The result is: " + fahrenheitToCelsius(temp) + " C.");
                } else {
                    System.out.println("The result is: " + celsiusToFahrenheit(temp) + " F.");
                }
            }
        }
    }


}
