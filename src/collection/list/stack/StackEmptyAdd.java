package collection.list.stack;

import java.util.Stack;

/*
The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO).
*
The stack data structure has the two most important operations that are push and pop. The push operation inserts an element into the stack and pop operation removes an element from the top of the stack.
Stack Class Constructor
The Stack class contains only the default constructor that creates an empty stack.

public Stack()

empty()
*/
public class StackEmptyAdd {
    public static void main(String[] args) {
        //creating an instance of Stack class
        Stack<Integer> stk= new Stack<>();
        // checking stack is empty or not
        boolean result = stk.empty(); //From stack, use this
        System.out.println("Is the stack empty? " + result);

// pushing elements into stack
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
//prints elements of the stack
        result = stk.isEmpty(); //From vector
        System.out.println("Is the stack empty? " + result);

    }
}
