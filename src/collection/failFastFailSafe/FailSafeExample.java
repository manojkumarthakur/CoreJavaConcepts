package collection.failFastFailSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
*Any structural modification done to the iterator affects the copied collection, not original collection. So, original collection remains structurally unchanged.

Fail-safe iterators allow modifications of a collection while iterating over it.
These iterators don't throw any Exception if a collection is modified while iterating over it.
They use copy of original collection to traverse over the elements of the collection.
These iterators require extra memory for cloning of collection. Ex : ConcurrentHashMap, CopyOnWriteArrayList
*
* */
public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        Iterator<Integer> itr =  list.iterator();
        System.out.println("List after modification : "+list);
        while (itr.hasNext()){
            System.out.println(itr.next());
            list.add(10);
            list.remove(1);
        }
        System.out.println("List after modification : "+list);


        CopyOnWriteArrayList<Integer> list2
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
        Iterator itr2 = list2.iterator();
        while (itr2.hasNext()) {
            Integer no = (Integer)itr2.next();
            System.out.println(no);
            if (no == 8)

                // This will not print,
                // hence it has created separate copy
                list2.add(14);
        }
        System.out.println(list2);
    }
}
