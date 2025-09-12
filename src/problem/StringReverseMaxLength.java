package problem;

public class StringReverseMaxLength {

    public  static String getLongestString(String str) {
        String logestString = "";

        String[] strings = str.split(" ");
        for (String s: strings) {
            if(getLength(s)> getLength(logestString)) {
                logestString = s ;
            }
        }
        return logestString;
    }

    public static int getLength(String str) {
        int length = 0;
        for (char c: str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String reverseInPlace(String str) {
        String [] strings = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String st: strings) {
            sb.append(reverseString(st));
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = str.length() -1 ; i >=0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "My name is Manoj";
//        System.out.println(getLongestString(str));
        System.out.println(reverseInPlace(str));
    }
}
