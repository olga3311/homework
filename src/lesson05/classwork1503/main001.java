package lesson05.classwork1503;

import java.util.Scanner;

public class main001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int minNumber = scanner.nextInt();
        int maxNumber = scanner.nextInt();

        boolean inRange = number >= minNumber  && number <= maxNumber;
        System.out.println(inRange);


    }
}
