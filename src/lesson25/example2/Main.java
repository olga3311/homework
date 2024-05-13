package lesson25.example2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle(10,8);
        Circle1 circle = new Circle1(5);

        System.out.println("Triangle square: " + triangle.getSquare());
        System.out.println("Rectangular square: " + rectangle.getSquare());
        System.out.println("Circle square: " + circle.getSquare());
    }
}
