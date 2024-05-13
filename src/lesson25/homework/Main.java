package lesson25.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the figure from the list: ");


        for (int i = 0; i < FigureType.values().length; i++) {
            System.out.println((i + 1) + ". " + FigureType.values()[i].getDiscription());
        }
        System.out.println("0.Exit");

        int choice = scanner.nextInt();
        while (true) {

            if ((choice >= 0) && (choice <= FigureType.values().length)) {
               break;
            }
        }
        if(choice == 0){
            return;
        }
        Perimeter p1 = null;
        switch (choice)
        {
            case 1:
                p1 = new Circle();
            break;

            case 2:
                p1 = new Rectangle();
                break;
            case 3 :
                p1 = new RegularPolygon();
                break;
        }

       if(p1 != null){
        p1.countPerimeter();
       }
       double res = p1.countPrice();
        System.out.println("The total price is : " + res);


    }
}
