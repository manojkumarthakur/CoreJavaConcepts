package concept.polymorphism;
/*Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.


*
Upcasting
If the reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:

class A{}
class B extends A{}

A a=new B();//upcasting


 */
class Bike{
    void run(){System.out.println("running");}
}
class Splendor extends Bike{
    void run(){System.out.println("running safely with 60km");}
}
public class RuntimePolymorphismExample {
    public static void main(String args[]){
        Bike b = new Splendor();//upcasting
        b.run();
    }
}
