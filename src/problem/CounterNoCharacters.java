package problem;

import java.util.HashMap;
import java.util.Map;

public class CounterNoCharacters {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        String str = "Manmoojjaaaa";
        char[] arr = str.toLowerCase().toCharArray();
        for(char ch : arr) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        String finalString = sb.toString();
        System.out.println(finalString);


    }
}
