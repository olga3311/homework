package lesson12.hometask;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        System.out.println("You are welcome in our grocery store!\nChoose your product: ");
        Scanner scanner = new Scanner(System.in);
        String[] productList  = new  String[]{
                "milk", "cheese", "cottage cheese", "sour milk",
                "cream", "whipped cream", "yoghurt", "fish", "beef", "pork", "chicken",
                "bread", "cake", "biscuits", "water", "black tea", "green tea", "coffee"};
        float[] price = new  float[]{ 0.96f, 2.5f, 0.87f, 0.75f, 0.63f, 1.29f, 0.98f, 6.50f, 12.50f, 9.99f,
                4.35f, 3.73f, 7.54f, 2.60f, 1.28f, 3.49f, 3.70f, 12.0f};

        String product = scanner.nextLine();
        boolean inList = false;
        int index = 0;

        for (int i =0; i < productList.length; i++) {
            if (product.equalsIgnoreCase(productList[i]) ) {
                inList = true;
                index = i;
                break;
            }
        }

        if (inList == false) {
            System.out.println("It's a pity, there,s no such product in our inventory.");
        }else{
            System.out.println("The price per item is:" + price[index] + " Euro.");

            System.out.println("Please, enter the amount: ");
            int amount = scanner.nextInt();
            System.out.println("The total price is:  " + price[index]*amount + " Euro.");

        }



    }

}
