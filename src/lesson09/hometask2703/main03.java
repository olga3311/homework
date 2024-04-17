package lesson09.hometask2703;

import java.util.Random;
import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        int[] array  = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
            System.out.print( array[i]  + " ");

        }
        System.out.println(" \n Введите значение любого элемента: ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for (int i = 0; i < array.length; i++){

            if (array[i] == num){
                System.out.println("Индекс элемента с этим значением = " + (i + 1));
                break;
            }

            if (i == (array.length -1))
            System.out.println(" В этом массиве нет такого элемента.");
        }



    }
}
