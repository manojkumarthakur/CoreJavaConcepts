package problem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CounterNoCharacters {

    public static String getStringCounter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character ch : str.toCharArray()) {
            map.computeIfAbsent(ch, k-> k+1);
        }
        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        String finalString = sb.toString();
        System.out.println(finalString);
        return finalString;

    }

    public static String getStringCounterSelf(String str) {
        Map<Character, Integer> map = new HashMap<>();
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
        return finalString;
    }

    public static void main(String[] args) {
        String str = "Manmoojjaaaa";
        System.out.println(getStringCounter(str));
        System.out.println(getStringCounterSelf(str));



    }
}
