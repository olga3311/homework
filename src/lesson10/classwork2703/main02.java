package lesson10.classwork2703;

import java.util.Random;
import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        Random random = new Random();
        int number = min + random.nextInt(max - min + 1);
        System.out.println(number);


    }

}
