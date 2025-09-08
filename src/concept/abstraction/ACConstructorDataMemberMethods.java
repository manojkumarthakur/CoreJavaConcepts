package concept.abstraction;

//Example of an abstract class that has abstract and non-abstract methods
abstract class Bike{
    Bike(){System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run(){System.out.println("running safely..");}
}
//Creating a Main class which calls abstract and non-abstract methods
public class ACConstructorDataMemberMethods {
    public static void main(String[] args) {
//        Bike b = new Honda(); //Bike() constructor will be called
        Honda b = new Honda(); //Bike() constructor will be called
        b.run();
        b.changeGear();
    }
}
