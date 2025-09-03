package collection.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
* HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
* */
public class HashSetAdd {
    public static void main(String[] args) {
        //Creating HashSet and adding elements
        Set<String> set = new HashSet<>();
        set.add("Manoj");
        set.add("Ajay");
        set.add("Ravi");
        set.add(null); // null is allowed
        set.add(null);
        System.out.println("while adding first time : " + set.add("Vijay"));
        System.out.println("while adding duplicate : " + set.add("Ravi"));
        set.add("Ajay");

//        System.out.println(set.isEmpty());
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
