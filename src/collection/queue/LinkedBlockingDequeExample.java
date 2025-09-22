package collection.queue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

//Concurrent dequeue
public class LinkedBlockingDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedBlockingDeque<>() ;
        deque.add("Manoj");
        deque.add("Manoj1");
        deque.add("Manoj2");
        deque.add("Manoj3");

        deque.stream().forEach(System.out::println);
        System.out.println("*******");
        deque.parallelStream()
                .forEach(System.out::println);

    }
}
