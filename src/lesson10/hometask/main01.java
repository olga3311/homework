package lesson10.hometask;

//Пользователь вводит размер массива и сам массив целых чисел.
//Удвоить каждое число и вывести результат в консоль.

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i =0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++){
          array [i] *= 2;
        }

        int[] doubledArray = new int[size*2];
        for (int i = 0; i > array.length; i++) {
            doubledArray[i*2] = array[i];
            doubledArray[i*2+1]=array[i];
        }

        for (int i=0; i<doubledArray.length; i++){
            System.out.println(doubledArray[i] + " ");
        }

    }
}
