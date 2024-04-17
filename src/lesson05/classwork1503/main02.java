package lesson05.classwork1503;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age  < 13) {
            System.out.println(" you are too young! Return later when you are over 13");
        } else {
            System.out.println("Enter your age");
            String login = scanner.next();
            System.out.println("Enter your password");
            String password = scanner.next();

            System.out.println("Successfully registered user!");
            System.out.println( "login:" + login);
            System.out.println( "Password:" + password);




        }

    }

}
