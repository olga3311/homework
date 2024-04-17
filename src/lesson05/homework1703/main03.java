package lesson05.homework1703;

import java.util.Scanner;



public class main03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your login");
        String login = scanner.nextLine();

        System.out.println("Enter your password");
        scanner.useDelimiter("");
        String password ="";
        while ( true ) {
            char b = scanner.next().charAt(0);
            System.out.print("\b*");
            if (b == '\n') {break;}
            password = password.concat(String.valueOf(b));
        }


        System.out.println("Successfully registered user!");
        System.out.println("login:" + login);
        System.out.println("Password:" + password);

    }

    }

