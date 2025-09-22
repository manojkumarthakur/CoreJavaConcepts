package collection.queue;
/*
* The Java Queue interface belongs to java.util package. It is a fundamental part of the Java Collections Framework designed to handle elements in a specific sequence, typically in a First-In-First-Out (FIFO) manner.
*The most common classes that implement the Queue interface in Java are LinkedList and PriorityQueue.
*
The LinkedList class provides a doubly-linked list implementation,
while the PriorityQueue class is based on a priority heap,
ordering its elements according to their natural ordering or a specified comparator.
 *
 Java provides the PriorityBlockingQueue class in the java.util.concurrent package, which offers a thread-safe priority queue implementation.
 *
 Queue Interface Declaration
public interface Queue<E> extends Collection<E>
*
Features of a Queue
The following are some important features of a queue.

As discussed earlier, FIFO concept is used for insertion and deletion of elements from a queue.
The Java Queue provides support for all of the methods of the Collection interface including deletion, insertion, etc.
PriorityQueue, ArrayBlockingQueue and LinkedList are the implementations that are used most frequently.
The NullPointerException is raised, if any null operation is done on the BlockingQueues.
Those Queues that are present in the util package are known as Unbounded Queues.
Those Queues that are present in the util.concurrent package are known as bounded Queues.
All Queues barring the Deques facilitates removal and insertion at the head and tail of the queue; respectively. In fact, deques support element insertion and removal at both ends.
 * */
public class QueueAdd {

}
