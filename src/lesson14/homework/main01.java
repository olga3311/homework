package lesson14.homework;

import java.util.Scanner;

public class main01 {


    public static int currMenu(String message,String[] currencies) {
        System.out.println(message);

        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + "." + currencies[i]);
        }
        System.out.println("0.Exit");

        boolean choice = true;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int initialCurrency = scanner.nextInt();
            if ((initialCurrency >= 0) && (initialCurrency <= currencies.length)) {
                return initialCurrency;
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

    public static double exchange( int initialCurrency, int targetCurrency, double amount) {

        double[] exchangeRate = new double[]{};

        switch (initialCurrency) {
            case 1:
                exchangeRate = new double[]{1, 1.09, 34.80};
                break;
            case 2:
                exchangeRate = new double[]{0.92, 1, 32.08};
                break;
            case 3:
                exchangeRate = new double[]{0.029, 0.031, 1};
                break;
        }
     return (amount * exchangeRate[targetCurrency-1]);
    }

    public static void main(String[] args) {

        String[] currencies = {"EURO", "USD", "TL"};

        System.out.println("You are welcome in currency converter!");
        int x = currMenu("Choose the initial currency:", currencies);
        double v = readAmount();
        int y = currMenu("Choose the target currency:",currencies);
        double ex = exchange(x,y,v);
        System.out.println("You receive: " + ex + " " + currencies[y-1]);

    }



}

