package lesson08.classwork.forLoop;

import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {

        String text = "I love Java";
        int textSize = text.length();
        for (int i = 0; i < textSize; i++) {
            System.out.println(text.charAt(i));


        }


// тожесамое с помощью while
        for (int i = 0; i< textSize; i++){
            System.out.println(text.charAt(i));
        }


        int counter = 0;

        while (counter < textSize) {
            char currentChar = text.charAt(counter);
            System.out.println("Буква с индексом"  + ":" + currentChar);
            counter++;

        }
    }
}