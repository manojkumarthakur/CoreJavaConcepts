package interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

// String s = "x2y5b1c7"
// print xxyyyyybccccccc
public class PrintCharacterNumberTimes {
    public static String formatString(String str){
        if(str.length() ==0 || str.length()%2==1){
            return "Invalid String";
        }
        char[] ch = str.toCharArray();
        for(int i=1; i<ch.length;i+=2){
            if(!Character.isDigit(ch[i])){
                return "Invalid String";
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i+=2) {
            Integer times = Integer.parseInt(ch[i+1]+"");
            for (int j = 0; j < times; j++) {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "My name is varun";
//        System.out.println(formatString(s));
        printCharCount(s);
    }

    public static void printCharCount(String str) {

        str = str.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray()) {
            if (c == ' ')
                continue;
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> e: map.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
