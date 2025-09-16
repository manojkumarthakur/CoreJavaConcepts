package java8.stream.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FlatteningAndProcessingNestedLists {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 4, 5), Arrays.asList(3, 6, 7));
        nestedLists.stream()
                .flatMap(Collection::stream) // Flatten
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort descending
                .map(n -> n * n) // Square each value
                .forEach(System.out::println);


        Stream<List<Integer>> integerStream = nestedLists.stream(); // [[1, 2, 3], [2, 4, 5], [3, 6, 7]]
//        System.out.println(integerStream.toList());

        Stream<Integer> flatStreamList = integerStream
                .flatMap(Collection::stream); // [1, 2, 3, 2, 4, 5, 3, 6, 7]

        System.out.println(flatStreamList.toList());

    }
}
