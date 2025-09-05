package collection.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/*
* Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order.
*
* Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

*
* public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
* */
public class LinkedHashMapAdd {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "Manoj");
        lhm.put(12, "Manoj12");
        lhm.put(13, "Manoj13");
        lhm.put(14, "Manoj14");
        lhm.put(null, "Ajay");

        System.out.println("lhm: " + lhm);
        //Fetching value
        System.out.println("lhm.values(): " + lhm.values());
        //Fetching key
        System.out.println("lhm.keySet(): " + lhm.keySet());
        //Fetching key-value pair
        System.out.println("lhm.entrySet(): " + lhm.entrySet());
        System.out.println("*********************** \n");
        for(Map.Entry<Integer, String> entry: lhm.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
