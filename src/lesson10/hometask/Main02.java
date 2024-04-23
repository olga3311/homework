package lesson10.hometask;

import java.util.Random;

//Сгенерировать массив из 10 случайных значений от 1 до 100.
//Вывести этот массив.
//Потом развернуть этот массив в обратном порядке.
//Вывести массив еще раз.
public class Main02 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
           array[i]  = min + random.nextInt(max - min + 1);
        }
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] reversedArray = new int[array.length];
        for (int i = 0; i <array.length; i++){
           reversedArray[i] = array[reversedArray.length - i - 1];
        }
        for (int i = 0; i < reversedArray.length; i++){
            System.out.print(reversedArray[i] + " ");
        }

    }
}
