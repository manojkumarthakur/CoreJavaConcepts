package problem;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {

    public static Optional<Character> findFirstUniqueCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }

        // 1. Count character frequencies
        // LinkedHashMap maintains insertion order, which is crucial for "first" unique.
        LinkedHashMap<Character, Long> charFrequencies = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // 2. Find the first character with a frequency of 1
        return charFrequencies.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(java.util.Map.Entry::getKey)
                .findFirst();
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        Optional<Character> unique1 = findFirstUniqueCharacter(s1);
        unique1.ifPresentOrElse(
                c -> System.out.println("First unique character in \"" + s1 + "\": " + c),
                () -> System.out.println("No unique character found in \"" + s1 + "\"")
        ); // Output: l

        String s2 = "loveleetcode";
        Optional<Character> unique2 = findFirstUniqueCharacter(s2);
        unique2.ifPresentOrElse(
                c -> System.out.println("First unique character in \"" + s2 + "\": " + c),
                () -> System.out.println("No unique character found in \"" + s2 + "\"")
        ); // Output: v

        String s3 = "aabb";
        Optional<Character> unique3 = findFirstUniqueCharacter(s3);
        unique3.ifPresentOrElse(
                c -> System.out.println("First unique character in \"" + s3 + "\": " + c),
                () -> System.out.println("No unique character found in \"" + s3 + "\"")
        ); // Output: No unique character found in "aabb"
    }
}
