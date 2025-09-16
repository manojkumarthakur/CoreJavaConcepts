package java8.stream.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 25);
        int max = numbers.stream()
                .max(Comparator.naturalOrder()).get();
        System.out.println(max);

        Optional<Integer> max1 = numbers.stream()
                .max(Integer::compare);
        max1.ifPresent(System.out::println);
    }
}
