package problem;

import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {
    public static void main(String[] args) {
        String first = "abcbcd";
        String second = "cdefef";
        String common = commonCharacters(first, second);
        System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");

    }

    public static String commonCharacters(String a, String b) {
        Set<Character> firstString = new HashSet<>();
        Set<Character> secondString = new HashSet<>();
        for (char c : a.toCharArray()) {
            firstString.add(c);
        }
        for (char c : b.toCharArray()) {
            secondString.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : firstString) {
            if (secondString.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}


