package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*Lambda expressions provide a portable and concise way to represent behaviour.
* They increase the modularity and flexibility of programming by enabling the sending of behaviour as an argument to methods.
* */
// 1. Define the functional interface
interface StringTransformer {
    String transform(String input);
}

public class LambdaBehaviorEncapsulation {

    // 2. Implement the generic method that accepts the list and the transformer
    public static List<String> transformList(List<String> list, StringTransformer transformer) {
        List<String> transformedList = new ArrayList<>();
        for (String item : list) {
            transformedList.add(transformer.transform(item));
        }
        return transformedList;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Without Lambda Expression
        List<String> namesUpperCase = transformList(names, new StringTransformer() {
            @Override
            public String transform(String input) {
                return input.toUpperCase();
            }
        });

        // With Lambda Expression
        List<String> namesUpperCaseLambda = transformList(names, input -> input.toUpperCase());

        names.forEach(System.out::println);
    }
}
