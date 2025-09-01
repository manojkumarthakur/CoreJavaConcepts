package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterfaceExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");

        ListIterator<String> listIterator = list1.listIterator();
        listIterator.add("Manoj"); // It will not be available in the immediate list iterator
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            System.out.println(listIterator.nextIndex());
        }
        System.out.println("*******************");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            System.out.println(listIterator.previousIndex());
        }

        listIterator.remove();
        System.out.println("*******************");
        System.out.println(list1);
    }

}
