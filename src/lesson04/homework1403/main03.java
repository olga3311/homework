package lesson04.homework1403;

import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Введите Ваш рост в см: ");
        int height = scanner.nextInt();
        float metre = (float) height/100;

        System.out.print("\n Введите Ваш вес в кг: ");
        int weight  = scanner.nextInt();

        float imt = (weight /(metre * metre));

        System.out.println( " \n Ваш ИМТ: " + imt);
    }
}
