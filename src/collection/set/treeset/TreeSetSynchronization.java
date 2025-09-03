package collection.set.treeset;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSynchronization {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        Set<String> syncrSet = Collections.synchronizedSet(ts);
        syncrSet.add("Manoj");
        syncrSet.add("Ajay");
        syncrSet.add("Vijay");

        System.out.println(syncrSet);

    }
}
