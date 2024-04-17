package lesson06.hometask1903;
/*Написать программу, которая рассчитывает индекс массы тела (ИМТ) и говорит о состоянии веса.
Для этого нужно написать такие методы:
1 Спросить у пользователя его вес в килограммах и рост в сантиметрах (целые числа)
2 Перевести рост в метры (для этого рост в см поделить на 100). Учтите, что результат будет не целым
3 Рассчитать ИМТ по формуле: вес / (рост ^ 2)
4 Вывести результат расчётов в консоль и оценку веса. Критерии оценивания
 (диапазон значений и словесная оценка): 0-15 - Анорексия 15-20 - Недостаточный вес
 20-25 - Нормальный вес 25-30 - Избыточный вес 30+ - Ожирение
 */

import java.util.Scanner;

public class main01 {

        public static void main(String[] args) {
            Scanner scanner =  new Scanner(System.in);

            System.out.print("Введите Ваш рост в см: ");
            int height = scanner.nextInt();
            float metre = (float) height/100;

            System.out.print("\n Введите Ваш вес в кг: ");
            int weight  = scanner.nextInt();
            float imt = (weight /(metre * metre));
            System.out.println( " \n Ваш ИМТ: " + imt);

            String  xWeight = " нормальный вес";
            if ( imt < 15 ) { xWeight  = "анарексия";
            } else if ( imt >=15 && imt < 20 ) {  xWeight = "недостаточный вес";
            } else if ( imt>=25 && imt<30 ) {  xWeight = "лишний вес";
            } else if ( imt >=30 ) { xWeight = "ожирение";}

            System.out.println(" У Вас " + xWeight);
        }
    }

