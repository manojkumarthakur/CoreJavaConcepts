package concept.abstraction;

/*
*A class that is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).
*
*
Abstraction in Java
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where we type the text and send the message. We do not know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.

Ways to achieve Abstraction
There are two ways to achieve abstraction in Java:

Using Abstract Class (0 to 100%)

Using Interface (100%)
*
Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
*
Abstract Method in Java
A method which is declared as abstract and does not have implementation is known as an abstract method.

Example of abstract method

abstract void printStatus();//no method body and abstract
* *
*
Rule: If there is an abstract method in a class, that class must be abstract.
Rule: If we are extending an abstract class that has an abstract method, we must either provide the implementation of the method or make this class abstract.
*/

//Creating an abstract class having abstract method
//abstract class Bike{
//    abstract void run();
//}
//Creating a child class and override abstract method
//class Honda extends Bike{
//    void run(){System.out.println("running safely");}
//}
//Creating a Main class to create object and call methods

public abstract class AbstractClassExample {
    public static void main(String[] args) {
        Bike hm = new Honda();
        hm.run();
    }

}
