package lesson03.classwwork;

public class main04 {
    public static void main(String[] args) {
        short sNumber = (short) 0b1110_1000_1100_1101; //-5939
        //lossy conversion
        byte number = (byte)sNumber;

        System.out.println(sNumber);
        System.out.println(number);
    }
}
