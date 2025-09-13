package problem;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinMaxCharacter {

    public static String maxMinCharacter(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray()) {
//            if(map.containsKey(c)) {
//                map.put(c, map.get(c) + 1);
//            } else {
//                map.put(c, 1);
//            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        char minChar = ' ';
        int maxCount = 0;
        int minCount = 0;
        int count = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(count ==0){
                maxCount = entry.getValue();
                minCount = entry.getValue();
                maxChar = entry.getKey();
                minChar = entry.getKey();
                count ++;
            }
            if(entry.getValue()> maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
            if(entry.getValue()< minCount) {
                minCount = entry.getValue();
                minChar = entry.getKey();
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxChar);
        sb.append(maxCount);
        sb.append(minChar);
        sb.append(minCount);
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabccaac";
        // a=5 b=1
        System.out.println(maxMinCharacter(str));
    }
}

