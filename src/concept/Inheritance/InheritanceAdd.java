package concept.Inheritance;
/*
*Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
*
* Inheritance in Java enables a class to inherit properties and actions from another class, called a superclass or parent class. A class derived from a superclass is called a subclass or child group.
* Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
*
* Why use inheritance?
For Method Overriding (so runtime polymorphism can be achieved).
For Code Reusability.
*
*
class Subclass-name extends Superclass-name
{
   //methods and fields
}
*
*
*
On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical(one parent multiple child).

In Java programming, multiple and hybrid inheritance is supported through interface only. We will learn about interfaces later.
  */
class Employee{
    float salary=40000;
}
class Programmer extends Employee{
    int bonus=10000;
}
public class InheritanceAdd {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.salary); // Parent class property
    }
}
