package lesson11.homework;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter!\n");
 while (true) {
     System.out.println("Выберите исходную валюту:");
     System.out.println("1.Euro");
     System.out.println("2.USD");
     System.out.println("3.TL");
     System.out.println("0. Exit.");

     Scanner scanner = new Scanner(System.in);

     double[] exchangeRate = new double[]{};
     String[] Curr = new String[]{"EUR","USD","TL"};
     int intCur = scanner.nextInt();

     if (intCur == 0) {
         System.out.println(" Good buy!");
         break;
     } else if (intCur == 1) exchangeRate = new double[]{1, 1.09, 34.80};
     else if (intCur == 2) exchangeRate = new double[]{0.92, 1, 32.08};
     else if (intCur == 3) exchangeRate = new double[]{0.029, 0.031, 1};


     System.out.println("Enter the amount: ");
     double amount = scanner.nextDouble();
     System.out.println("Ииедите целевую валюту: ");
     int target = scanner.nextInt();

     System.out.println("You receive " + amount*exchangeRate[target-1]+ " "+Curr[target-1]);
 }
    }

}









