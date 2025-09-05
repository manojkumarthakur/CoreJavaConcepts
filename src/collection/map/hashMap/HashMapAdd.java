package collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;
/* HashMap is part of the Java Collections Framework and is found in the java.util package.
*Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
*public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
*
*
* */
public class HashMapAdd {
    public static void main(String[] args) {
        // Creating a HashMap to store student IDs and their corresponding names
        Map<Integer, String> studentMap = new HashMap<>();
        System.out.println(studentMap);
        // Adding some student records to the HashMap
        studentMap.put(1001, "John Smith");
        studentMap.put(1002, "Emily Brown");
        studentMap.put(1003, "Michael Johnson");
        // Retrieving and printing a student's name based on their ID
        int studentIdToFind = 1002;
        String studentName = studentMap.get(studentIdToFind);
        if (studentName != null) {
            System.out.println("Student with ID " + studentIdToFind + " is: " + studentName);
        } else {
            System.out.println("Student with ID " + studentIdToFind + " not found.");
        }
        // Iterating over the entries of the HashMap and printing each key-value pair
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        // Checking if a student ID exists in the HashMap
        int idToCheck = 1004;
        boolean exists = studentMap.containsKey(idToCheck);
        System.out.println("Student with ID " + idToCheck + " exists in records: " + exists);

        System.out.println("After invoking putIfAbsent() method ");
        studentMap.putIfAbsent(5, "Orange");
        System.out.println(" studentMap.putIfAbsent : " + studentMap.putIfAbsent(5, "Grape")); //return original value if already present
        System.out.println(studentMap);

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(104,"Ravi");
        studentMap.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry<Integer, String> m:studentMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
