package lesson12.classwork;

import java.util.Random;
import java.util.Scanner;

public class main04 {

    public static void main(String[] args) {

 /*
    Игра "угадай число", где нужно угадывать число от 1 до 10.
    Программа загадывает число, пользователь пробует угадать.
    Если число угадано, программа поздравляет с выигрышем и заканчивает
    Если число не угадано, программа говорит, будет ли загаданное число меньше или больше
    Подсчитать к-во попыток угадывания
     */

        Random random = new Random();

        int min = 1;
        int max = 10;
        int number = min + random.nextInt(max - min + 1);

        Scanner scanner = new Scanner(System.in);
        int attepts = 0;

        System.out.println("Guess the number between  1 and 10");
        while (true) {
            int guess = scanner.nextInt();
            attepts++;

            if (guess == number) {
                System.out.println("This is correct!");
                System.out.println("Attepts: " + attepts);
                break;
            } else if ( guess > number ){
                System.out.println("The number is too large! Try again: ");
            } else {
                System.out.println("The number is too small! Try again: ");
            }
        }

    }

}
