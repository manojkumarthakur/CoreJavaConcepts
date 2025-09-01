package collection.set.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetFromAnotherCollection {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Ajay");

        Set<String> set = new HashSet<>(list);
        set.add("Ravi");
        System.out.println(set);

        System.out.println("************************");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

}
