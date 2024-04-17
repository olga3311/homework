package lesson08.classwork;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        int x;
        int y;
        int result = 0;

        Scanner scanner = new Scanner(System.in);

        boolean condition = true;
        while (condition){
            System.out.println( "Enter two integer numbers");

            System.out.println(" enter x:");
            x = scanner.nextInt();
            System.out.println("enter y");
            y = scanner.nextInt();

            result = x + y;

            System.out.println("Result of Sum = " + result);

            if (result > 100) {
                condition = false;
            }

        }
        System.out.println("Last result" + result);
        System.out.println(" Цикл завершен");

    }
}
