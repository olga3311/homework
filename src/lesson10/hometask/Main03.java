package lesson10.hometask;

import java.util.Random;
import java.util.Scanner;

//Пользователь задает вопрос. Вывести ему ответ-предсказание, симулируя популярный
// в поп-культуре магический шар
//с нарисованной цифрой 8, который дает ответы на вопросы, если его потрясти.
//Возможные варианты ответа:
//Да.
//Нет.
//Весьма вероятно.
//Не рассчитывай на это.
//Не могу предсказать.
//Да, но будь осторожен.
//По всей видимости.
//Знаки указывают на "да".
//Знаки указывают на "нет".
//
//Если хотите, чтобы на одни и те же вопросы программа давала одинаковые ответы,
// в качестве ключа (сида) ГСЧ
//используйте строку, которую ввел пользователь, вызвав у нее метод .hashCode()
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] answers = {
                "Да.",
                        "Нет.",
                       "Весьма вероятно.",
                "Не рассчитывай на это.",
                "Не могу предсказать.",
                "Да, но будь осторожен.",
                "По всей видимости.",
                "Знаки указывают на da.",
                "Знаки указывают на net."
        };
        String question = scanner.nextLine();
        Random random = new Random(question.hashCode());
        int index = random.nextInt(9);
        String answer = answers[index];
        // answers[random.nextInt() % answers.length]
        System.out.println(answer);


    }

}
