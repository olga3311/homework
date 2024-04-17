package lesson08.classwork;

public class main01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int result;
        int counter = 0;

        while (counter < 3) {
            result = x * y;
            System.out.println( "Result x * y = " + result);

            x = x + 5;
            y = y + 10;
            counter++;
        }

        System.out.println( "the programme is over");
    }

}
