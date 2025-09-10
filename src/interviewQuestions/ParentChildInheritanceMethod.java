package interviewQuestions;

/*
* If I have two classes one Parent and one child class. Child class extends the parent class? In both classes I have one common method ? If I create a reference of Parent class and initialize it with object of child class, which method will get called. If I have constructor?
* */
/*Ans:
When you create a parent class reference and assign it a child class object, calling a common method will invoke the child class's method, and the constructors will execute in a specific order starting with the parent. This is due to two core object-oriented programming (OOP) principles: dynamic method dispatch and constructor chaining.
Which method gets called?
The child class's method is called through a process known as dynamic method dispatch or runtime polymorphism.
Runtime resolution: The Java Virtual Machine (JVM) determines which version of the method to execute at runtime, not compile time. The decision is based on the actual object being referred to, not the reference variable's type.
Method overriding: The common method in the child class is said to override the method in the parent class. As long as the child's method has the same name, parameters, and compatible return type, its implementation will be used.

* */
class Parent {
    public void commonMethod() {
        System.out.println("Parent's method");
    }
}

class Child extends Parent {
    // This method overrides the parent's method
    @Override
    public void commonMethod() {
        System.out.println("Child's method");
    }
}

public class ParentChildInheritanceMethod {
    public static void main(String[] args) {
        //Method
        Parent parentRef = new Child(); // A Parent reference holding a Child object
        parentRef.commonMethod();      // Calls the Child's version

        //Constructor
        Parent1 parentRef1 = new Child1();
    }
}

/*How are constructors handled?
Constructors are not inherited or overridden. Instead, a process called constructor chaining ensures that the parent class's constructor is called first to properly initialize the base portion of the object.
Parent constructor first: When you instantiate a child class, the parent class's constructor is always executed before the child class's constructor.
Implicit super(): If you don't explicitly call a parent constructor with the super() keyword, the compiler automatically adds a call to the parent's default (no-argument) constructor as the first statement in the child's constructor.
Explicit super(): If the parent class only has a parameterized constructor, the child's constructor must explicitly call super() with the correct arguments as its very first statement.
* */
class Parent1 {
//    public Parent1(String m) { // if only paremeterized contructor and not called explicitly then CT Error
//    }
    public Parent1() {
        System.out.println("Parent constructor called.");
    }
}

class Child1 extends Parent1 {
    public Child1() {
        // The compiler automatically adds super() here
        System.out.println("Child constructor called.");
    }
}

