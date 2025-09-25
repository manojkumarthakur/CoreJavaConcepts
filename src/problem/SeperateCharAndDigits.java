package problem;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3. Separate characters and digits from an input string in an online editor.
* */
public class SeperateCharAndDigits {

    public static void usingPattern(){
        Pattern p = Pattern.compile("[a-z]+|\\d+");
        Matcher m = p.matcher("123abc345def");
        ArrayList<String> allMatches = new ArrayList<>();
        while (m.find()) {
            allMatches.add(m.group());
        }
        System.out.println(allMatches);
    }
    public static void usingPredefined(){
        String str = "Man23Ffst";

        StringBuffer ch = new StringBuffer();
        StringBuilder digit = new StringBuilder();

        for(char c: str.toCharArray()){
            if(Character.isDigit(c)) {
                digit.append(c);

            } else {
                ch.append(c);
            }
        }
        System.out.println(ch.toString());
        System.out.println(digit.toString());
    }

    public static void usingASCII() {
        String str = "Man23Ffst";
        StringBuffer ch = new StringBuffer();
        StringBuilder digit = new StringBuilder();

        for(char c: str.toCharArray()){
            if(((int)c >='0') && ((int) c <= '9')) {
                digit.append(c);

            } else {
                ch.append(c);
            }
        }
        System.out.println(ch.toString());
        System.out.println(digit.toString());
    }
    public static void main(String[] args) {
//       usingPattern();
//       usingPredefined();
       usingASCII();


    }
}
