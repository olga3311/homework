package lesson10.classwork2703;

import java.util.Random;
import java.util.Scanner;

public class main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i< array.length; i++){

            array[i] = -10 + random.nextInt(10- (-10) +1);
            System.out.print(array[i] + " ");
        }
        System.out.println();

       for (int i=0; i<array.length; i++){
           if (array[i] < 0) {
               array[i] = 0;
           }
       }
     for ( int i  = 0; i<array.length; i++){
            System.out.print( array[i] + " ");
        }
    }

}
