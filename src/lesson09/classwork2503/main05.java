package lesson09.classwork2503;

public class main05 {
    public static void main(String[] args) {

        int[] array = new int[10];

               for (int i = 0; i < array.length; i++) {
                   array [i] = (int)Math.pow(2,i);


        }
               for (int i=0; i<array.length; i++) {
                   System.out.println(array[i]);
               }
    }
}
