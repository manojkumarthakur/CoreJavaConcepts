package java8.methodReference.instanceMethod;
/*
*
2) Reference to an Instance Method
like static methods, you can refer instance methods also. In the following example, we are describing the process of referring the instance method.

Syntax

containingObject::instanceMethodName
* */

interface Sayable{
    void say();
}

public class InstanceMethod {
    public void sayable() {
        System.out.println("saying.....");
    }
    public static void main(String[] args) {
        InstanceMethod instanceMethod = new InstanceMethod();// Creating object
        // Referring non-static method using reference
        Sayable s = instanceMethod::sayable;
        // Calling interface method
        s.say();

//        / Referring non-static method using anonymous object
        Sayable s2 = new InstanceMethod()::sayable;// You can use anonymous object also
        // Calling interface method
        s2.say();


    }
}
