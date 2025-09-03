package collection.set.treeset;

import java.util.TreeSet;

// Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quite fast.
//Java TreeSet class doesn't allow null elements.
//Java TreeSet class is non-synchronized.
//Java TreeSet class maintains ascending order.
//The TreeSet can only allow those generic types that are comparable.
// For example, the Comparable interface is being implemented by the StringBuffer class.
// public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable
public class TreeSetAdding {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Manoj");
        ts.add("Ajay");
        ts.add("Vijay");

        System.out.println(ts);

    }
}
