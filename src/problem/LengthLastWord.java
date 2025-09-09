package problem;
/*
* Length of Last Word
* https://leetcode.com/problems/length-of-last-word/description/
* */
public class LengthLastWord {
    public static int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");
        return str[str.length-1].length();

    }

    public static void main(String[] args) {
        String str = "Helllo world ";
        System.out.println(lengthOfLastWord(str));
    }
}
