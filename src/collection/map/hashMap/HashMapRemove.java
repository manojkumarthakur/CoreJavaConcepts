package collection.map.hashMap;

import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103, "Gaurav");
        System.out.println("Initial list of elements: "+map);
        //key-based removal
        map.remove(101);
        System.out.println("Updated list of elements based on key : "+map);
        //value-based removal
        map.remove(101);
        System.out.println("Updated list of elements: "+map);
        //key-value pair based removal
        map.remove(102, "Rahul");
        map.remove(103, "Rahul");// not found

        System.out.println("Updated list of elements using key and value: "+map);
        map.clear();
        System.out.println("Updated list of elements after clear: "+map);

    }
}
