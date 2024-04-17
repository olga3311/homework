package lesson04.homework1403;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" Ведите фактическую прибыль за месяц:");
        float income = scanner.nextFloat();
        float percent  = income / 100;
        System.out.println("Ваша выплата в пенсионный фонд составляем:" + percent*3 );
        System.out.println("Ваша налог на прибыль составляем:"  + percent*15);
        System.out.println("\n Ваша чистая прибыль состовляет:" + percent*82);


    }
}
