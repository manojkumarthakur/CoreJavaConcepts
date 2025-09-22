package collection.list.stack;

import java.util.Stack;

/*
Stack Class peek() Method
The peek() method returns the top element of the stack without removing it. It allows us to inspect the element at the top of the stack without modifying the stack's contents. It looks at the element that is at the top in the stack. It also throws EmptyStackException if the stack is empty.
*
*
 Stack Class search() Method
The method searches the object in the stack from the top. It parses a parameter that we want to search for. It returns the 1-based location of the object in the stack. These topmost object of the stack is considered at distance 1.
It returns the object location from the top of the stack. If it returns -1, it means that the object is not on the stack.

 *
 Size of the Stack
We can also find the size of the stack using the size() method of the Vector class. It returns the total number of elements (size of the stack) in the stack.

 */
public class StackPeekSearchExp {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
// pushing elements into Stack
        stk.push("Apple");
        stk.push("Grapes");
        stk.push("Mango");
        stk.push("Orange");
        System.out.println("Stack: " + stk);
// Access element from the top of the stack
        String fruits = stk.peek();
//prints stack

        System.out.println("Element at top: " + fruits);
        System.out.println("Stack after peek: " + stk); // No removal


        // Search an element
        int location = stk.search("Mango");
        System.out.println("Location of Mango: " + location);

        //size of stack
        System.out.println(stk.size());
    }
}
