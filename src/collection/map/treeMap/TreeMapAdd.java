package collection.map.treeMap;

import java.util.TreeMap;

/*
*Java TreeMap class is a red-black tree-based implementation. It provides an efficient means of storing key-value pairs in sorted order.
* important points about Java TreeMap class are:
Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.
*public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, Serializable
*
* */
public class TreeMapAdd {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
    }
}
