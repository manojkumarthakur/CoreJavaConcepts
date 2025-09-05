package collection.map.concurrentHashMap;
/*
* those collections which don't use fail-fast concept may not necessarily create clone/snapshot of it in memory to avoid ConcurrentModificationException. For example, in case of ConcurrentHashMap, it does not operate on a separate copy although it is not fail-fast. Instead, it has semantics that is described by the official specification as weakly consistent(memory consistency properties in Java).
* */
// Java program to illustrate
// Fail-Safe Iterator which
// does not create separate copy

/*Difference between Fail Fast Iterator and Fail Safe Iterator
The major difference is fail-safe iterator doesn't throw any Exception, contrary to fail-fast Iterator.This is because they work on a clone of Collection instead of the original collection and that's why they are called as the fail-safe iterator.
* */

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeItr {
    public static void main(String[] args)
    {
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map
                = new ConcurrentHashMap<String, Integer>();

        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        // Getting an Iterator from map
        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = (String)it.next();
            System.out.println(key + " : " + map.get(key));

            // This will reflect in iterator.
            // Hence, it has not created separate copy
            map.put("SEVEN", 7);
        }
    }
}
