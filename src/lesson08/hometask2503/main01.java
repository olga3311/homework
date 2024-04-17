package lesson08.hometask2503;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {

        System.out.println(" Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int Num = scanner.nextInt();
        int Sum =0;

        for ( int i = 2; i <= Num; i = i + 2) {
            Sum = Sum + i;

            System.out.println(i);
        }
        System.out.println( " The Sum of all the even numbers is: " + Sum);



        if (Num % 2==0)
          System.out.println( "Sum =" + ( Num +2)*(Num / 2)/2);
      else
          System.out.println( "Sum =" + (Num+1)*((Num-1)/2)/2);

    }
}
