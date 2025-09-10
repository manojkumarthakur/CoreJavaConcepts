package collection.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
On which java stream interface we can use lambda expressions? What is the type of interface used in streams?

Lambda expressions in Java can be used with functional interfaces. A functional interface is an interface that contains exactly one abstract method. This single abstract method is what the lambda expression provides an implementation for.
The Java Stream API heavily utilizes functional interfaces to enable concise and expressive operations on collections of data. Common functional interfaces used within the Stream API include:

Conclusion:
In essence, any operation within the Java Stream API that requires a piece of executable logic (like filtering, transforming, or consuming elements) will leverage a functional interface, making it a prime candidate for implementation using a lambda expression.
* */
public class StreamInterfaceUsedOn {
    public static void main(String[] args) {
        /*1. Predicate<T>: Represents a boolean-valued function of one argument. Used in methods like filter().
         * */
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        /*2.Function<T, R>: Represents a function that accepts one argument and produces a result.
        Used in methods like map().
        * */
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.stream().map(n -> n * 2).forEach(System.out::println);

        /*
        * 3. Consumer<T>: Represents an operation that accepts a single input argument and returns no result.
        * Used in methods like forEach().
        * */
        List<String> fruits = Arrays.asList("apple", "banana");
        fruits.forEach(fruit -> System.out.println("I like " + fruit));

        /*4. Supplier<T>: Represents a supplier of results.
        Used when a result is needed without any input, for example, in generate() or orElseGet().
        * */
        Optional<String> empty = Optional.empty();
        String value = empty.orElseGet(() -> "Default Value");
        System.out.println(value);
        //look for generate() example

        /*5. Comparator<T>: Represents a comparison function, which imposes a total ordering on some collection of objects.
         Used in methods like sorted().
        *
        * */
        List<String> words = Arrays.asList("zebra", "apple", "banana");
        words.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);
//        words.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//        words.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);







    }
}
