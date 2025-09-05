package collection.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
*
A Map doesn't allow duplicate keys, but you can have duplicate values.
*  HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
* */
public class MapExample {
    public static void main(String[] args) {
        // Non Generic
        Map map = new HashMap();
        map.put(1, "Manoj");
        map.put(2, "Manoj1");
        map.put(3, "Manoj");

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        //Generic
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Manoj");
        map1.put(2, "Manoj1");
        map1.put(3, "Manoj");

        for(Map.Entry<Integer, String> entry: map1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
