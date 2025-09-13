package java8.lambda;

@FunctionalInterface
interface Sayable3{
    String say(String message);
}


public class LambdaMultipleStatements {
    public static void main(String[] args) {
        // You can pass multiple statements in lambda expression
        Sayable3 s = (str) -> {
            String s1 = "Hello ";
            String finalStr = s1 + str;
            return finalStr;
        };
        System.out.println(s.say("Manoj"));
    }


}
