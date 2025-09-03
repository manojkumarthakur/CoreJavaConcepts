package collection.set.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
/*
Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operations and permits null elements.
Java LinkedHashSet class is non-synchronized.
Java LinkedHashSet class maintains insertion order.
* */
public class LinkedHashSetAdding {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Manoj");
        linkedHashSet.add("Ajay");
        linkedHashSet.add("Manoj");
        linkedHashSet.add("Vijay");
        Iterator<String> itr = linkedHashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(linkedHashSet);
        for (String s: linkedHashSet) {
            System.out.println(s);
        }
    }
}
