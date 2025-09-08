package concept.abstraction;
/*
*An interface in Java is a blueprint of a class. It has static constants and abstract methods.
*
*
In other words, we can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.
It cannot be instantiated just like the abstract class.
Since Java 8, we can have default and static methods in an interface.
Since Java 9, we can have private methods in an interface.
*
*
There are mainly three reasons to use an interface. They are given below.

It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It is used to achieve loose coupling.
*
it means all the methods in an interface are declared with an empty body,
* and all the fields are public, static and final by default.
*
Internal Addition by The Compiler
The Java compiler adds the public and abstract keywords before the interface method.
* Moreover, it adds public, static and final keywords before data members.
*
* */

//Creating an interface
interface Printable{
    void print();
}
//Creating a class that implements Printable
class Printer implements Printable{
    public void print(){System.out.println("Hello");}
}
//Creating a class that creates objects and call methods

public class InterfaceExample {
    public static void main(String[] args) {
        Printable p = new Printer();
        p.print();
    }
}
