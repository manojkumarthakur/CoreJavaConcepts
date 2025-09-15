package java8.methodReference.instanceMethod;

import java.util.function.BiFunction;

class Arithmetic{
    public  int add(int a, int b){
        return a+b;
    }
    public  float add(int a, float b){
        return a+b;
    }
    public  float add(float a, float b){
        return a+b;
    }
}
public class PredefinedFunctionalInterface {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> function = new Arithmetic()::add;
        Integer sum = function.apply(10, 29);
        System.out.println(sum);
        //overloading

        BiFunction<Integer, Integer, Integer>adder1 = new Arithmetic()::add;
        BiFunction<Integer, Float, Float>adder2 = new Arithmetic()::add;
        BiFunction<Float, Float, Float>adder3 = new Arithmetic()::add;
        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 20.0f);
        float result3 = adder3.apply(10f, 20.0f);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);




    }
}
