package collection.list.arrayList;

import java.util.*;

/*
There are various ways to traverse the collection elements:

1. By Iterator interface.
2. By for-each loop.
3. By ListIterator interface.
4. By for loop.
5. By forEach() method.
6. By forEachRemaining() method.
* */
public class ArrayListTraversal {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ArrayList<String> aList = new ArrayList<>();
        list.add("Apple");
        list.add("Apple1");
        list.add("Apple2");
        System.out.println("***** using direct list ****");
        System.out.println(list);
        System.out.println("***** using Iterator ****");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("***** using Enhanced for loop ****");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("***** using normal for loop ****");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Get and Set

        System.out.println("list before  update at 1: " + list.get(1));
        list.set(1, "Manoj");
        System.out.println("list post update at 1: " + list.get(1));

        // Sort
//        list.sort();
        Collections.sort(list);
        System.out.println("Sorted list " + list);

        //Creating a list of numbers
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for (Integer number : list2)
            System.out.println(number);

        // ListIterator
        System.out.println("******* using ListIterator ******");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());

        System.out.println("******* using ListIterator ******");
        ListIterator<String> listIterator2 = list.listIterator();
        while (listIterator2.hasNext())
            System.out.println(listIterator2.next());

        // for loop
        System.out.println("Traversing list through for loop:");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        // forEach
        System.out.println("Traversing list through forEach loop:");
//        list.forEach(a -> System.out.println(a));//lambda
        list.forEach(System.out::println); // method reference

//     forEachRemaining
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> iterator2 = list.iterator();
        iterator2.forEachRemaining(a -> System.out.println(a));
    }
}
