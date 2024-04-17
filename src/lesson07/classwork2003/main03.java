package lesson07.classwork2003;

import java.util.Scanner;
public class main03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

                int days = 0;

        switch (month){
            case 1:
            case 2:
                days = 28;
                break;
            case 3:
                case 4:
            case 5:
            case 6:
                case 9:
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;


        }
        System.out.println(days);
    }
}
