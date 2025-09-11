package problem;
/*
* 1: Print HELLO for the given string "AHCECLWLXO"
2: Print HELLO in CAPITAL letters for the given string "ahceclwlxo"
* */
public class PrintHello {
    public static void printHello(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i+=2) {
            sb.append(str.toCharArray()[i]);
        }
        System.out.println(sb.toString());
    }
    public static void printHelloUpperCase(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i+=2) {
            sb.append(str.toCharArray()[i]);
        }
        System.out.println(sb.toString().toUpperCase());
    }

    public static void main(String[] args) {
        String str = "AHCECLWLXO";
        String str2 = "ahceclwlxo";

        printHello(str);
        printHelloUpperCase(str2);

    }
}
