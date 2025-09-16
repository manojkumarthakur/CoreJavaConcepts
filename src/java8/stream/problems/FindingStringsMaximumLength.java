package java8.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindingStringsMaximumLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cat", "elephant", "dog");
        OptionalInt max = words.stream()
                .mapToInt(String::length)
                .max();
        max.ifPresent(len -> words.stream()
                .filter(str -> str.length() == len)
                .forEach(System.out::println));

        System.out.println("***********");
        int maximum = words.stream()
                .mapToInt(String::length)
                .max().getAsInt();
        words.stream()
                .filter(str -> str.length() == maximum)
                .forEach(System.out::println);

    }
}
