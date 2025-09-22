package collection.list.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/*
Iterate Elements
Iterate means to fetch the elements of the stack. We can fetch elements of the stack using three different methods are as follows:

Using iterator() Method
Using forEach() Method
Using listIterator() Method

*/
public class StackIterateElements {
    public static void main(String[] args) {
        //creating an object of Stack class
        Stack stk = new Stack();
//pushing elements into stack
        stk.push("BMW");
        stk.push("Audi");
        stk.push("Ferrari");
        stk.push("Bugatti");
        stk.push("Jaguar");

        // Iterator
        Iterator<String> itr= stk.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("**********************");

        // For Each
        stk.forEach(System.out::println);
        System.out.println("**********************");

        // ListIterator
        ListIterator<String> listIterator = stk.listIterator(stk.size()); //reading in reverse
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
