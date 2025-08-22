package collection.list.arrayList;

import java.util.ArrayList;

public class ArrayListRetainAll {
    public static void main(String[] args) {
        // Create the first ArrayList (al) and add elements to it
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        // Create the second ArrayList (al2) and add elements to it
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        // Retain only the elements that are present in both al and al2
        al.retainAll(al2);
        // Print the elements of al after retaining the elements of al2
        System.out.println(al);
    }
}
