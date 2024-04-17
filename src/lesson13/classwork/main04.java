package lesson13.classwork;

import java.util.Random;
import java.util.Scanner;

public class main04 {

    public  static  int getRandomNumber(int min, int max){
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lowest and highest number: ");

        int min = scanner.nextInt();
        int max = scanner.nextInt();

        int randomNumber = getRandomNumber(min, max);

        System.out.println("Random number in that range: " + randomNumber);

    }
}
