package collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        //Adding elements to the end of the list
        al.add("Manoj");
        System.out.println("After invoking add(E e) method: "+al);
        al.add("Manoj2");

        //Adding an element at the specific position
        System.out.println();
        System.out.println("After invoking add(int index, E element) method: "+al);

        al.add(1, "Ajay");
        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();
        //Adding elements to the end of the list
        al2.add("Manoj3");
        al2.add("Manoj4");

        //Adding second list elements to the first list
        System.out.println();
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);
        al.addAll(al2);
        System.out.println(al);

        //Adding second list elements to the first list at specific position
        System.out.println();
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);
        al.addAll(1, al2);

        System.out.println(al);

        // make a new list using subList()
        List<String> subList = al.subList(1, 3);
        System.out.println(subList);
    }
}
