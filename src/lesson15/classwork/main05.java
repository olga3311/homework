package lesson15.classwork;
// посчитать сумму элементов массива
// посчитать сумму элементов на каком- то прмежутке

public class main05 {
    public static int sum(int[] array) {
        return sum (array,0, array.length);
    }

    public static int sum( int[] array, int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += array[i];
        }
        return sum;
    }


}






