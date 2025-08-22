package collection.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("manoj11");
        ll.add("manoj2");
        ll.add("manoj3");

        Iterator<String> itr = ll.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("At index 1: " + ll.get(1));
    }
}
