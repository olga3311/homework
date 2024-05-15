package lesson27.hometask;
//Given a string, return if all occurrences of a given letter are always
// immediately followed by the other given letter.
public class task1 {

    public static boolean findLetter(String txt, char a, char b){
        for (int i = 0; i < txt.length(); i++) {
            if(txt.charAt(i) == a){
                if( i == txt.length() - 1) return false;
                if(!(txt.charAt(i +1) == b)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        boolean b = findLetter( "he headed to the store", 'h', 'e');
        System.out.println(b);

    }
}
