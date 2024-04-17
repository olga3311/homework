package lesson07.classwork2003;

import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

             String dayofWeek = "";

            switch (n) {
            case 1 :
                dayofWeek = "Monday";
                break;
            case 2 :
                dayofWeek = "Tuesday";
                break;
            case 3 :
                dayofWeek = "Wednesday";
                break;
            case 4 :
                dayofWeek = " Tuesday";
                break;
            case 5 :
                dayofWeek = "Friday";
                break;
            case 6 :
                dayofWeek = "Saturday";
                break;
            case 7 :
                dayofWeek = "Sunday";
                break;
            }

        System.out.println(dayofWeek);
    }
}
