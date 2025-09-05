package collection.map.hashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* Hashtable is also a part of the legacy collection classes and is present in the java.util package.
* Points to Remember
A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
Java Hashtable class contains unique elements.
Java Hashtable class doesn't allow null key or value.
Java Hashtable class is synchronized.
The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
*
*public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable
*
* Legacy Support: The hashtable has been included in the Java Collections of the very early versions of Java. It is still in use in legacy codebases to provide a way to interoperate with older Java applications and libraries.

Enumeration Support: HashTable provides for enumeration, where you can traverse through its elements utilizing the Enumeration interface. While enumerations are less appropriate for repetition tasks compared to iterators or enhanced for loops, they are available for backward compatibility with older Java codes.


* */
public class HashTableAdd {

    public static void main(String[] args) {
/*Hashtable()*/
        // Creating an empty hashtable with default initial capacity genearlly 11 and load factor 0.75
        Hashtable<Integer, String> ht = new Hashtable<>();

        System.out.println(ht);
/*Hashtable(int initialCapacity)*/
        // Creating an empty hashtable with a specified initial capacity and load factor 0.75
        int initialCapacity = 20;
        Hashtable<String, Integer> hashtable = new Hashtable<>(initialCapacity);
        // Print the hashtable
        System.out.println("Hashtable: " + hashtable);
/*Hashtable(int initialCapacity, float loadFactor)*/
        // Creating an empty hashtable with specified initial capacity and load factor
//        int initialCapacity = 20;
        float loadFactor = 0.5f; // Custom load factor
        Hashtable<String, Integer> hashtable2 = new Hashtable<>(initialCapacity, loadFactor);
        // Print the hashtable
        System.out.println("Hashtable: " + hashtable2);

/*Hashtable(Map<? extends K, ? extends V> t)*/
        // Creating a Map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        // Creating a hashtable from the map
        Hashtable<String, Integer> hashtable3 = new Hashtable<>(map);
        // Print the hashtable
        System.out.println("Hashtable: " + hashtable3);
    }
}
