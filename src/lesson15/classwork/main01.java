package lesson15.classwork;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        // currency converter
        System.out.println("You are welcome to Currency converter!");
        while (true) {
            System.out.println("Выберите исходную валюту:");
            String[] currencies = {"EURO", "USD", "TL"};

            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + "." + currencies[i]);
            }
            System.out.println("0.Exit");

            Scanner scanner = new Scanner(System.in);
            int initialCurrency = scanner.nextInt();
            if (initialCurrency == 0) {
                return;
            }


            System.out.println("ВВедите колличество: ");
            double amount = scanner.nextDouble();
            System.out.println("Choose the target currency from the list: ");
            int targetCurrency = scanner.nextInt();

            double[] coefficients = {1, 1.06, 34.42};
            amount /= coefficients[initialCurrency - 1];
            amount *= coefficients[targetCurrency - 1];

            System.out.println("Total: " + amount + " " + currencies[targetCurrency - 1]);

        }

    }
}
