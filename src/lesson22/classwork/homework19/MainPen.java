package lesson22.classwork.homework19;

public class MainPen {
    public static void main(String[] args) {

        Pen pen = new Pen();

        for (int i = 0; i < 20; i++) {
            pen.write("Hello world!!!");
            pen.checkInk();
            if (pen.getInkAmount() <= 0) {
                pen.refill();
                System.out.println("(refill  the pen)");
            }
        }
    }
}