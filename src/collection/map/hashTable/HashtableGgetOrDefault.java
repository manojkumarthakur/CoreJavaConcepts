package collection.map.hashTable;

import java.util.Hashtable;

public class HashtableGgetOrDefault {
    public static void main(String[] args) {
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        //Here, we specify the if and else statement as arguments of the method
        System.out.println(map.getOrDefault(1000, "IamDefaultValue"));
        System.out.println(map.getOrDefault(100, "IamDefaultValue"));
    }
}
