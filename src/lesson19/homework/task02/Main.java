package lesson19.homework.task02;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("blue" , 6.0);
        System.out.println("your pen is " + pen1.color+ " and has consumption " + pen1.getInkConsumption()
                + " has volume "+ pen1.checkInk());

        pen1.write("sdsdgd  ,m,bj  fsbdxhxfgn.");
        System.out.println("The pen has volume "+ pen1.checkInk());
        pen1.refill();
        pen1.write("Good bye!");
        System.out.println("The pen has volume "+ pen1.checkInk());
    }
}
