package collection.map.hashMap;

/*
* HashMap contains an array of the nodes, and the node is represented as a class. It uses an array and LinkedList data structure internally for storing Key and Value. There are four fields in HashMap.
Node <K, V>
* int hash
* K Key
* V Value
* Node<K,V> next
*
Working of HashMap in Java
* the hash code of "Aman" is 2657860.
* Index = hashcode(Key) & (n-1)
* Index = 2657860 & (16-1) = 4
* Handling Collisions
Despite efforts to minimize them, collisions are inevitable. Two main strategies to handle collisions are:
1. Chaining: Storing all elements that hash to the same index in a linked list or tree at that
2. Open Addressing: Finding another open slot within the hash table by probing (for example, linear probing, quadratic probing) when a collision occurs.
*
* Rehashing and Load Factor
To maintain performance, a HashMap needs to resize itself (rehash) when the number of elements grows significantly. It is controlled by the load factor that is a measure of how full the hash table is allowed to get before its capacity is automatically increased.
Load Factor: HashMap's default load factor is 0.75. It means that when the hash table is 75% full, it will resize by doubling its current capacity.
Rehashing: When rehashing occurs, a new, larger array is created, and all the existing entries are rehashed to new indices in the new array. It ensures that the hash table maintains a good balance between time and space complexity.
*
* */

public class HashMapInternalWorking {
    public static void main(String[] args) {
        Integer a = 10;
        String b = "manojd";

        System.out.println(b.hashCode());

    }
}
