package lesson06.hometask1903;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        System.out.println( "\n  Тест. Примитивные типы данных и переменные." +
                "\n Вопрос 1. К примитивным типам данных относятся: " +
                "\n a. байт   b.класс   c.массив.  " +
                        "\n   Выберите правильный вариант ответа:  " );
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        int correctAns = 0;
     if (answer.equals("a")) correctAns++;

        System.out.println("\n Вопрос 2. Какой тип данных необходимо использовать для числа π: " +
                "\n a. int    b.boolean   c.float.  " +
                "\n   Выберите правильный вариант ответа:  " );
answer = scanner.next();
if (answer.equals("c")) correctAns++;

        System.out.println("\n Вопрос 3. Сколько всего категорий данных определенно в Java : " +
                "\n a. 1    b.2   c.3.  " +
                "\n   Выберите правильный вариант ответа:  " );
        answer = scanner.next();
        if (answer.equals("b")) correctAns++;

        System.out.println("\n Вопрос 4. К символьному типу данных относится: " +
                "\n a. double    b.char   c.long  + " +
                "\n   Выберите правильный вариант ответа:  " );
        answer = scanner.next();
        if (answer.equals("b")) correctAns++;

        System.out.println("\n Вопрос 5. Какая разрядность у типа данных float: " +
                "\n a. 8 bit   b.64 bit  c.32 bit  " +
                "\n   Выберите правильный вариант ответа:  " );
        answer = scanner.next();
        if (answer.equals("c")) correctAns++;


        if ( correctAns<3)
        System.out.println( " К сожалению, Вы не сдали тест! ");

        else System.out.println( "Поздравляем! Вы упешно прошли тест! " +
                "\n Ваш балл: " + correctAns);


    }
}
