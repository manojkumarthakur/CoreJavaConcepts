package collection.list.vector;

import java.util.List;
import java.util.Vector;

/*
Vector is like the dynamic array which can grow or shrink its size.
Unlike array, we can store n-number of elements in it as there is no size limit.
*
It is similar to the ArrayList, but with two differences-

Vector is synchronized.
Java Vector contains many legacy methods that are not the part of a collections framework.
*
Java Vector class Declaration
public class Vector<E>
extends Object<E>
implements List<E>, Cloneable, Serializable
*/
public class VectorAdd {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
//        list.addElement() //not part of list interface

        //Create a vector
        Vector<String> vec = new Vector<String>();
        //Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        //Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Elements are: "+vec);

    }
}
