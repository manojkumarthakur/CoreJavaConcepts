package collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
sometimes the elements of the queue are needed to be processed according to the priority, that's where a PriorityQueue comes into action.
*

PriorityQueue Class Declaration
Let's see the declaration for java.util.PriorityQueue class.

public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable

*/
public class PriorityQueueAdd {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
//        System.out.println(queue.peek()); //returns null
//        queue.element(); // NoSuchElementException
//        System.out.println(queue.poll()); //returns null
//        queue.remove(); // NoSuchElementException

        // Adding elements to the PriorityQueue
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.offer("Rahul");
        queue.offer("Rahul");
// Displaying the head of the queue using element() method
        // This method throws an exception if the queue is empty
        System.out.println("head:" + queue.element());
        // Displaying the head of the queue using peek() method
        // This method returns null if the queue is empty
        System.out.println("head:" + queue.peek());
        // Iterating through the queue elements
        System.out.println("iterating the queue elements:");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // Removing the head of the queue using remove() method
        // This method throws an exception if the queue is empty
        queue.remove();
        // Removing the head of the queue using poll() method
        // This method returns null if the queue is empty
        queue.poll();
        // Displaying the queue elements after removing two elements
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }
}
