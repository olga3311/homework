package lesson20.hometask;

import java.util.Scanner;

public class CurrencyConverter {

        public static Currency currMenu(String message ) {
            System.out.println(message);

            for (int i = 0; i < Currency.values().length; i++) {
                System.out.println((i + 1) + "." + Currency.values()[i]);
            }
            System.out.println("0.Exit");

            boolean choice = true;
            Scanner scanner = new Scanner(System.in);

            while (true) {
                int initialCurrency = scanner.nextInt();
                if ((initialCurrency >= 0) && (initialCurrency <= Currency.values().length)){
                    return Currency.values()[initialCurrency-1];
                }
            }
        }

        public static double readAmount() {

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the amount: ");
                double d = scanner.nextDouble();
                if (d > 0) {
                    return d;
                }

            }
        }

        public static double exchange(Currency initialCurrency, Currency targetCurrency, double amount) {
            if (initialCurrency == targetCurrency){
                return amount;
            }else {
                return (amount * ExchangeRate.valueOf(initialCurrency.name() + "2" + targetCurrency.name()).getExchangeRate());
            }

        }

        public static void main(String[] args) {


            System.out.println("You are welcome in currency converter!");
            Currency x = currMenu("Choose the initial currency:");
            double v = readAmount();
            Currency y = currMenu("Choose the target currency:");
            double ex = exchange(x, y, v);
            System.out.println("You receive: " + ex + " " + y.name());

        }

    }


