package lesson13.homework;
  /*Написать программу, которая рассчитывает индекс массы тела (ИМТ) и говорит о состоянии веса.
Для этого нужно написать такие методы:
        1 Спросить у пользователя его вес в килограммах и рост в сантиметрах (целые числа)
2 Перевести рост в метры (для этого рост в см поделить на 100). Учтите, что результат будет не целым
3 Рассчитать ИМТ по формуле: вес / (рост ^ 2)
4 Вывести результат расчётов в консоль и оценку веса. Критерии оценивания
 (диапазон значений и словесная
 оценка): 0-15 - Анорексия 15-20 - Недостаточный вес 20-25 - Нормальный вес 25-30 - Избыточный вес
  30+ - Ожирение */

import java.util.Scanner;

public class main03 {

        public static int getWeight(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите Ваш вес в кг.: ");
                return  scanner.nextInt();

        }
        public static int getHeight(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите Ваш рост в см.: ");
                return scanner.nextInt();

        }

        public static float convertHeight (int height){
                return  (float) height / 100;
        }

        public static float getYourImt (int weight, float meter){
                return (float) (weight / (meter * meter));

        }

        public static void report (float ind){

                String xWeight = " нормальный вес";
                if (ind < 15) {
                        xWeight = "анарексия";
                } else if (ind >= 15 && ind < 20) {
                        xWeight = "недостаточный вес";
                } else if (ind >= 25 && ind < 30) {
                        xWeight = "лишний вес";
                } else if (ind >= 30) {
                        xWeight = "ожирение";
                }
                System.out.println(" \n Ваш ИМТ: " + ind);
                System.out.println(" У Вас " + xWeight);
        }

        public static void main(String[] args) {

                float heightM = convertHeight(getHeight());
                int weight = getWeight();
                report(getYourImt(weight,heightM));

                }
        }
