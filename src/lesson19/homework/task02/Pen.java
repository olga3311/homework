package lesson19.homework.task02;

import java.util.Scanner;

public class Pen {
    String color;
    private double currentInkVolume = 100;
    private  double inkConsumption;


    Pen (String color, double inkConsumption){
        this.color = color;
        this.inkConsumption = inkConsumption;
    }

     void write(String text){

        for(int i = 0; i < text.length(); i ++){
            if (text.charAt(i)!= ' ') {
                if (currentInkVolume >= inkConsumption) {
                    System.out.print(text.charAt(i));
                    currentInkVolume -= inkConsumption;
                }
            }else{
                System.out.print(" ");
            }
        }
         System.out.println();
    }

    void refill() {
        currentInkVolume = 100;
    }

    public double getInkConsumption() {
        return inkConsumption;
    }

    public double getCurrentInkVolume() {
        return currentInkVolume;
    }

    public void setInkConsumption(double inkConsumption) {
        this.inkConsumption = inkConsumption;
    }

    double checkInk() {
      return currentInkVolume;
    }
}
