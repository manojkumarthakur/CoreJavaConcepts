package java8.stream.problems;

import java.util.Arrays;
import java.util.List;

public class ConvertingUppercase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        words.stream()
                .map(str -> str.toUpperCase()) // using lambda
                .map(String::toUpperCase) //using method reference
                .forEach(System.out::println);
    }
}
