package java8.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicates {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> list = fruits.stream()
                .distinct()
                .collect(Collectors.toUnmodifiableList());
        list.forEach(System.out::println);

        Set<String> set= fruits.stream()
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(set);
    }

}
