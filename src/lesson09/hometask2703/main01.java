package lesson09.hometask2703;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int counter = 0;


        while( num < 1){
            System.out.print("Введите натуральное число: ");
            num = scanner.nextInt();
            counter++;

        }
        System.out.println( " Поздравляем! Вы ввели натуральное число с " + counter  +
                " попытки!");



    }

}
