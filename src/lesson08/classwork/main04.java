package lesson08.classwork;

import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int summa = 0;
        boolean condition = true;



        while (condition){
            System.out.println( "Please enter integer number (negative number for exit)");

            int userNumber = scanner.nextInt();
            if(userNumber > 0) {
                summa = summa  + userNumber;
            } else {
                condition = false;
            }
            }
        System.out.println(" Cумма всех введенных чисел = " + summa);
    }
}
