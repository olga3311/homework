package lesson09.hometask2703;

import java.util.Scanner;

public class main02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите  начальное значение, шаг и количество элементов: ");

        int val = scanner.nextInt();
        int step = scanner.nextInt();
        int num = scanner.nextInt();

        int[] array = new int[num];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = val + i*step;
            sum = sum + array[i];

            System.out.println( array[i]);

        }
        System.out.println( " The Sum is: " + sum );

    }
}
