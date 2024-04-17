package lesson07.classwork2003;

import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( a+ b>c && b+c>a && c+a>b) {
            System.out.println("this is a triangular ");
        } else {
            System.out.println(" this is not a triangular");
        }

    }
}
