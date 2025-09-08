package concept.polymorphism;
class Animal{
    void eat(){System.out.println("animal is eating...");}
}
class Dog extends Animal{
    void eat(){System.out.println("dog is eating...");}
}
class BabyDog extends Dog{}

public class TryOutput {
    public static void main(String args[]){
        Animal a=new BabyDog();
        a.eat();
    }
}
