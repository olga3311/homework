package lesson25.homework;

import java.util.Scanner;

public class Circle extends Perimeter {


    public Circle() {};


    @Override
    public void countPerimeter() {

        System.out.println("Enter the radius: ");
        Scanner scanner = new Scanner(System.in);

        double rad = scanner.nextDouble();
        this.sideLength = 2 * Math.PI * rad;
    }

}
