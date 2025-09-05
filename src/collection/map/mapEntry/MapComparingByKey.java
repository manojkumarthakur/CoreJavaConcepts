package collection.map.mapEntry;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapComparingByKey {
    public static void main(String[] args) {
        // Creating a HashMap instance to store key-value pairs
        Map<Integer, String> map = new HashMap<Integer, String>();
        // Adding key-value pairs to the map
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        // Returns a Set view of the mappings contained in this map

        // Returns a Set view of the mappings contained in this map
        map.entrySet() // Returns a Set view of the mappings contained in this map
                .stream() // Returns a sequential Stream with this collection as its source
//                .sorted(Map.Entry.comparingByKey()) // Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) // Sorted according to the provided Comparator, here reverse order
                .forEach(System.out::println); // Performs an action for each element of this stream
    }

}
