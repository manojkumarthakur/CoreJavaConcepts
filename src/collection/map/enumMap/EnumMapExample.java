package collection.map.enumMap;
/*
* Java EnumMap class is the specialized Map implementation for enum keys. It inherits Enum and AbstractMap classes.
*
* public class EnumMap<K extends Enum<K>,V> extends AbstractMap<K,V> implements Serializable, Cloneable
 * */

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    // create an enum
    public enum Days {
        Monday, Tuesday, Wednesday, Thursday
    };

    public static void main(String[] args) {
        //create and populate enum map
        EnumMap<Days, Integer> enumMap = new EnumMap<>(Days.class);
        enumMap.put(Days.Monday, 1);
        enumMap.put(Days.Tuesday, 2);
        enumMap.put(Days.Wednesday, 3);
        // print the map
        for(Map.Entry<Days, Integer> entry: enumMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
