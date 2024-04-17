package lesson07.classwork2003;

import java.util.Scanner;

public class main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int mark = scanner.nextInt();

        if (mark < 30) {
            System.out.println("F");
        } else if (mark < 60) {
            System.out.println("D");
        } else if (mark < 75){
            System.out.println("c");
    } else if (mark<90){
        System.out.println("b");

    } else {
        System.out.println("a");
    }

    }
}
