package java8.lambda;
interface Sayable1{
    public String say(String str);
}

public class LambdaSingleParameter {
    public static void main(String[] args) {
        Sayable1 s1 = (s) -> {
            return "I have nothing to say....." + s;
        };

        System.out.println(s1.say("Manoj"));
    }
}
