package lesson27.classwork;

public class Main  {

    public static void main(String[] args) {

        SUtil util = new SUtil();

        String sentence = "the quick brown fox jumps over the lazy dog";
        int len = sentence.length();
        if (util.isPangram(sentence)){
            System.out.println("This is a pangram string");}
            else
            System.out.println("This is not a pangram string");


        byte[] test = util.parseIp("200.10.5.1");
        System.out.println(test[0] + "." + test[1]+ "."+test[2]+ "." + test[3]);



        }
    }








