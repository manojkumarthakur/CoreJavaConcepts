package collection.map.hashTable;

import java.util.Hashtable;

public class HashTableputIfAbsent {
    public static void main(String[] args) {
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Initial Map: "+map);
        //Inserts, as the specified pair is unique
        map.putIfAbsent(12, "ajay");
        System.out.println(map);
//Returns the current value, as the specified pair already exist
        System.out.println(map.putIfAbsent(101,"Rajesh")); // Does not update the value
        System.out.println("Updated Map: "+map);


//        Null Key and Value are not supported
//        map.putIfAbsent(null, "Manoj");
//        map.putIfAbsent(101, null);
    }
}
