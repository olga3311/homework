package lesson23.classwork;
// найти максимальное значение в массиве

public class Main03 {
    public  static double findMax( double[] array){
        double maxValue = array[0];
        for( int i = 1; i < array.length; i++) {
            if (array[i]>maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        double[] array = {4.45, 32.1, 78, 11.3, 12, 8};
        double max = findMax(array);
        System.out.println( "Max: " + max);
    }
}
