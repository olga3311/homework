package lesson13.classwork;

import java.util.Random;
import java.util.Scanner;

public class main02 {

    public static int rollDice() {
        Random random = new Random();
        int roll = 1 + random.nextInt(6);

        return roll;

       // return main04.getRandomNumber(1,6);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int roll = rollDice();
            System.out.println( "Dice rolled: " + roll);

            input = scanner.next();
        } while (!input.equals("0"));

    }
}
