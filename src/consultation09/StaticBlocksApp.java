package consultation09;
import java.util.Arrays;
public class StaticBlocksApp {
    public static void main(String[] args) {
//        System.out.println("До вызова конструктора класса: " + Arrays.toString(StaticBlocks.strings));


        StaticBlocks sb = new StaticBlocks();

        System.out.println("\n =============================== \n");

//        StaticBlocks sb1 = new StaticBlocks();
//        System.out.println(sb.getTitle());
//        System.out.println(sb.getCapacity());

        System.out.println("После вызова конструктора класса: " + Arrays.toString(StaticBlocks.getStrings()));

        StaticBlocks.printInfo();
        sb.showInfo();

        System.out.println("value counter: " + StaticBlocks.counter);
    }

}
