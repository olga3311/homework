package lesson05.homework1703;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" Ведите фактическую прибыль за месяц:");
        float income = scanner.nextFloat();
        float percent  = income / 100;
        int taxPercent = 22;
        if ( income < 20000 ) {  taxPercent = 18;
        }
        else if ( income>=10000) { taxPercent = 13;
        }

        System.out.println("Ваша выплата в пенсионный фонд составляем:" + percent*3 );

        System.out.println("Ваша налог на прибыль составляем:"  + percent*taxPercent);

        System.out.println("\n Ваша чистая прибыль состовляет:" + (percent*97 - percent*taxPercent)
        );



    }
}
