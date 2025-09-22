package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.BlockingDeque;

/*
we need a class that implements the Deque interface, and that class is ArrayDeque. It grows and shrinks as per usage. It also inherits the AbstractCollection class.

The important points about ArrayDeque class are:

Unlike Queue, we can add or remove elements from both sides.
Null elements are not allowed in the ArrayDeque.
ArrayDeque is not thread safe, in the absence of external synchronization.
ArrayDeque has no capacity restrictions.
ArrayDeque is faster than LinkedList and Stack.

*
ArrayDeque Class Declaration
Let's see the declaration for java.util.ArrayDeque class.

public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable
* */
public class ArrayDequeAdd {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("Manoj");
        queue.add("Ajay");
        queue.add("ManVijaynoj");
        queue.add("Vijay");

        queue.stream()
                .filter(p -> p.contains("Man"))
                .forEach(q-> System.out.println("Man containing words :"+q));
        System.out.println("*********");
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        deque.offerLast("Ajai");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
//        deque.poll();
//        deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }

        queue.add("");
        queue.offer("");
        queue.offerFirst("");
        queue.offerLast("");

        queue.peek();
        queue.peekFirst();
        queue.peekLast();

        queue.element();

        queue.poll();
        queue.pollLast();
        queue.pollFirst();

        queue.remove();
        queue.removeFirst();
        queue.removeLast();
        queue.removeIf(str ->str.contains("Man"));




    }
}
