package lesson14.consultation;
/*
  виселица
 */

import java.util.Random;
import java.util.Scanner;

//public static class main01 {
   /* public static String getRandomWord() {
        Random random = new Random();
        String[] words = {
                "apple", "java", "hello," +
                "world", "orange",
                "code", "programming", "class", "main"};

        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }

    public static char readLetter() {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        return letter;

    }

    public static void printWord(String word, boolean[] guessed) {
        for (int i = 0; i < word.length(); i++) {
            if (guessed[i]) {
                System.out.println(word.charAt(i) + " ");

            } else {
                System.out.println("_");
            }
        }
    }


public static boolean gameWon (boolean[] guessed){
    for (int i = 0; i< guessed.length; i++){
        if(!guessed[i]) {
            return false;
        }
    }
    return true;
    }

    public void wrongLetter() {
        String word = getRandomWord();
        boolean[] guessed = new boolean[word.length()];
    }

    int()atteptsLeft = 7;
        while (atteptsLeft > 0){
            System.out.println("\n Attempts left: " + atteptsLeft);
        }

            boolean letterFound = false;
            for(int i = 0; i < word.length(); i++){
             if(letter == word.length.charAt(i)){
                 letterFound = true;
                 guessed[i] = true;
             }
            }
            if(!letterFound){
                atteptsLeft --;
            }
            if(gameWon(guessed)){
                System.out.println("You won! Congratulations!");
                return;
            }
        }
        System.out.println("You lost! Word was: " + word);
*/

