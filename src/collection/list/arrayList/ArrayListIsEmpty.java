package collection.list.arrayList;

import java.util.ArrayList;

public class ArrayListIsEmpty {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> al = new ArrayList<String>();
        // Check if the ArrayList is empty
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
        // Add elements to the ArrayList
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        // Display a message after insertion
        System.out.println("After Insertion");
        // Check if the ArrayList is empty after insertion
        System.out.println("Is ArrayList Empty: " + al.isEmpty());

        // Create an ArrayList of Integer type with an initial capacity of 10
        ArrayList<Integer> al1 = new ArrayList<Integer>(10);
        // Print the size of the ArrayList using the size() method
        System.out.println("The size of the array is: " + al1.size());
    }
}
