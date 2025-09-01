package collection.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
