package lesson25.homework;

import java.util.Scanner;

public class Rectangle extends Perimeter {

    public Rectangle() {};


    @Override
    public void countPerimeter() {
        System.out.println("Enter the bigger side length: ");
        Scanner scanner = new Scanner(System.in);
        double bs = scanner.nextDouble();

        System.out.println("Enter the smaller side length:");
        double ss = scanner.nextDouble();
        this.sideLength =  2 * (bs + ss);
    }
}
