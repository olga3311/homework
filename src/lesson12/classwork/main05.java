package lesson12.classwork;

import java.util.Scanner;

public class main05 {
 /*
    Пользователь вводит целое число
    Проверить, является ли число простым
    Простые числа - такие, которые делятся нацело только на себя и 1
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Number is not prime");
                break;

            }
        }
        if (isPrime) {
        System.out.println("The number is prime");
        }else {
            System.out.println("The number is not prime");
        }

    }
}
