package interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintFirstUniqueCharacter {

    public static void printChar(String str) {
        Map <Character, Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        map.keySet().stream()
                .filter(p -> map.get(p) ==1)
                .limit(1)
//                .collect(Collectors.toUnmodifiableList())
                .forEach(System.out::println);

    }
    public static void main(String[] args) {
        String str = "manojm";
        printChar(str);
    }
}
