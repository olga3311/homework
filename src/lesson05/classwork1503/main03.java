package lesson05.classwork1503;

import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number ==0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }
    }
}
