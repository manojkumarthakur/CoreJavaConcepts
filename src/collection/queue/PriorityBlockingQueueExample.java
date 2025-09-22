package collection.queue;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

//Concurrent dequeue
// There are several other queue implementation in the java.util.concurrent for thread safety
public class PriorityBlockingQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityBlockingQueue<>();
        queue.add("Manaoj");
        queue.offer("ajay");

        queue.parallelStream()
                .map(str -> "Hello " + str)
                .forEach(System.out::println);

    }
}
