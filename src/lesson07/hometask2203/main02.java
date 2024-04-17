package lesson07.hometask2203;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int mark = scanner.nextInt();

            char grade;

            if (mark < 30) {
                grade = 'E';
            } else if (mark < 60) {
                grade = 'D';
            } else if (mark < 75) {
                grade = 'C';
            } else if (mark < 90) {
                grade = 'B' ;
            } else {
                grade = 'A';
            }
        System.out.println("Ваша оценка: " + ((byte) 70 -grade) );
            // Доп задание: также перевести оценку из буквенной в цифровую пятибальную,
            // НЕ ИСПОЛЬЗУЯ switch или любой другой оператор (в одну строчку)
        }
    }
