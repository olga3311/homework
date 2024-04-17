package lesson05.homework1703;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age  < 14) {
            System.out.println (" You are a child!");}

        else if (age<21) {
            System.out.println("You are a teenager!");}

        else  {
            System.out.println("You are an adult!");
        }
    }
}
