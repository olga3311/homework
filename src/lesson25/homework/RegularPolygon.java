package lesson25.homework;

import java.util.Scanner;

public class RegularPolygon extends Perimeter {


    public RegularPolygon() {};

    @Override
    public void countPerimeter() {
        System.out.println("Enter the side length: ");
        Scanner scanner = new Scanner(System.in);
       double sl = scanner.nextDouble();

        System.out.println("Enter the side amount:");
        double sa = scanner.nextDouble();
        this.sideLength = sa * sl;
    }
}
