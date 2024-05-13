package lesson25;

import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) {
        String text = "Hello world!";
        System.out.println(text);
        text =text.toUpperCase();
        System.out.println(text);
        System.out.println("*".repeat(text.length()));

        text =text.replace("l", "!");
        System.out.println(text);
        System.out.println(text.endsWith("!"));


        //text = text.indent(4);
        System.out.println(text);
        text = text.trim();
        System.out.println(text);


        String [] arr = text.split(" ");
        System.out.println(Arrays.toString(arr));

        }
    }