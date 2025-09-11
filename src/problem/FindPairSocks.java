package problem;

import java.util.HashMap;
import java.util.Map;

/*Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are n=7 socks with colors ar = {1,2,1,2,1,3,2}. There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.
* */
public class FindPairSocks {
    public static int countSocks(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int socksCount = 0;
//        for(int a: arr) {
//            map.put(a, map.getOrDefault(a, 0) + 1);
//        }

        for (int ch :arr) {
            map.merge(ch, 1, Integer::sum);
        }
        System.out.println(map);

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            socksCount += entry.getValue()/2;
        }
        return socksCount;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,1,2,1,3,2};
        System.out.println(countSocks(ar));
    }
}
