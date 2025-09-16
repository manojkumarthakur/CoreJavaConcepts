package java8.functionalInterface;
/*
 An Interface that contains exactly one abstract method is known as functional interface.
 It can have any number of default, static methods but can contain only one abstract method.
 It can also declare methods of Object class.

Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
 It is a new feature in Java, that helps to achieve functional programming approach.

 A functional interface can have methods of object class.
 */
@FunctionalInterface
interface Sayable{
    void say(String msg);// abstract method

    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);

}
public class FunctionalInterfacesAdd {
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Sayable s = new FunctionalInterfacesAdd()::say;
        s.say("Hello there!");
    }
}

