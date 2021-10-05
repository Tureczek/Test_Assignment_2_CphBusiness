import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CustomStringBuilder {

    public static String returnString(String word) {
        return word;
    }

    public static char[] charArray() {
        String word = "aBc";

        char [] list = new char[3];
        if(word.length() < 3){
            word = word + "Bc";
        }

        for (int i = 0; i <= 2; i++){
            list[i] = word.charAt(i);
        }
           return list;
    }

    public static String reversWord() {
        String word = "aBc";
        StringBuilder reverseWord = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            reverseWord.append(word.substring(word.length() - 1));
            if (word.length() > 1) {
                word = word.substring(0, word.length() - 1);
            }
        }
        return reverseWord.toString();
    }

    public static String toUpperCase() {
        String word = "aBc";
        return word.toUpperCase();
    }


    public static String toLowerCase() {
        String word = "aBc";
        return word.toLowerCase();
    }
}
