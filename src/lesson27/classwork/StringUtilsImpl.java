package lesson27.classwork;

import java.util.Locale;

public abstract class StringUtilsImpl implements StringUtils {

    @Override
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
        // return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
    private boolean isLetter(char ch){
        if(!Character.isLetter(ch))
            return false;
        return true;
    }

    public boolean isPangram(String sentence) {
        int size = 26;
        sentence = sentence.toLowerCase();
        boolean[]present = new boolean[size];
        for(int i = 0; i < sentence.length(); i++){
            if(isLetter(sentence.charAt(i))){
                int letter = sentence.charAt(i) - 'a';
                present[letter] = true;
            }
        }
        for (int i = 0; i<size; i++){
            if (!present[i]){
            return false;}
        }
        return true;
    }



    @Override
    public byte[] parseIp(String ip) {
        String [] parts = ip.split("\\.");

        byte[] result = new byte[4];
        result[0] = (byte)Integer.parseInt(parts[0]);
        result[1] = (byte)Integer.parseInt(parts[1]);
        result[2] = (byte)Integer.parseInt(parts[2]);
        result[3] = (byte)Integer.parseInt(parts[3]);
        return result;
    }



    // шифрует
    @Override
    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            sb.append((char)(ch + 3));
        }
        return  sb.toString();
    }

    @Override
    public String decrypt(String data) {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < data.length(); i++){
            char ch = data.charAt(i);
            sb.append((char)(ch + 3));
        }
        return sb.toString();
    }

@Override
   public int countOccurencies(String text, char letter) {
        if (text == null) {
            return 0;
        }
         int counter = 0;
    for (int i = 0; i < text.length(); i++) {
        if(text.charAt(i) == letter){
           counter++;
        }
    }
    return  counter;
    }





// разворачивает строку текст

    @Override
    public String reverse(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i>0; i --){
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }



    @Override
    public String wordReverse(String text) {
        StringBuilder sb = new StringBuilder();
        String [] words = text.split( " ");
        for (int i = words.length -1; i >= 0; i--) {
           sb.append(words[i]).append(" ");
        }
        return sb.toString();
    }

    @Override
    public String toCamelCase(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split( " ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()){
              continue;
            }
        if (i == 0){
            sb.append(words[i].toLowerCase());
        } else {
            sb.append(words[i].substring(0,1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase());
        }
        }
        return sb.toString();
    }
}
