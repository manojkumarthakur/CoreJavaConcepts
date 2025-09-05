package collection.collectiosClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*Java collection class is used exclusively with static methods that operate on or return collections. It inherits Object class.

The important points about Java Collections class are:

Java Collection class supports the polymorphic algorithms that operate on collections.
Java Collection class throws a NullPointerException if the collections or class objects provided to them are null.
*
* public class Collections extends Object
* */
public class CollectionsAdd {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("Core Java");
        list.add("Advance Java");
        System.out.println("Initial collection value:"+list);
        Collections.addAll(list, "a","Servlet","JSP");
        System.out.println("After adding elements collection value:"+list);
        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);
        System.out.println("After adding array collection value:"+list);
    }
}
