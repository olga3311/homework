package lesson05.homework;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg:");
        float weight = scanner.nextFloat();

        System.out.println("Enter your height in cm:");
        float height = scanner.nextInt() / 100f;


        float bodyIndex = weight / (height * height);
        System.out.println(" Your BMI is:" + bodyIndex);


    }
}
