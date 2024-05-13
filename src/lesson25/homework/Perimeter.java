package lesson25.homework;

import java.util.Scanner;

public abstract class Perimeter {
   protected double sideLength;
   protected double sideAmount;
   private double price;


   public double countPrice(){
      System.out.println("What is the price for one metre of the fence? ");
      Scanner scanner = new Scanner(System.in);
      double price = scanner.nextDouble();
      return this.sideLength * price;
   }
   public abstract void countPerimeter();

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getSideLength() {
      return sideLength;
   }

   public double getSideAmount() {
      return sideAmount;
   }

   public void setSideLength(double sideLength) {
      this.sideLength = sideLength;
   }

   public void setSideAmount(double sideAmount) {
      this.sideAmount = sideAmount;
   }
}
