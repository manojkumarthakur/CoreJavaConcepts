package collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDuplicate {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes"); //trying duplicate key

        Set<Integer> set = map.keySet();
        for (Integer i : set){
            System.out.println("Key: " + i + " Value: " + map.get(i));
        }

    }
}
