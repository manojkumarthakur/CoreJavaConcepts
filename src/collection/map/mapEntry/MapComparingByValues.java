package collection.map.mapEntry;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapComparingByValues {
    public static void main(String[] args) {
        // Creating a HashMap instance to store key-value pairs
        Map<Integer, String> map = new HashMap<Integer, String>();
        // Adding key-value pairs to the map
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        // Returns a Set view of the mappings contained in this map

        map.entrySet()
                .stream()
//                .sorted(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Sorted according to the provided Comparator based on value, here reverse order
                .forEach(System.out::println); //Method reference
//                .forEach(val -> System.out.println(val)); //Lambda
    }

}
