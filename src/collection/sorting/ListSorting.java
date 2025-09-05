package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/*
* Collections class provides static methods for sorting the elements of a collection. If collection elements are of a Set or Map, we can use TreeSet or TreeMap. However, we cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.
*
* public void sort(List list): is used to sort the elements of List. List elements must be of the Comparable type.

Note: String class and Wrapper classes implement the Comparable interface. So if you store the objects of string or wrapper classes, it will be Comparable.
*
* */
public class ListSorting {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Reverse order
        Collections.sort(al, Collections.reverseOrder());
        itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
