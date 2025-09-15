package java8.methodReference.staticReference;
/*
You can refer to static method defined in the class. Following is the syntax and example which describe the process of referring static method in Java.

Syntax

ContainingClass::staticMethodName

* */
interface Sayable{
    void say();
}
public class ReferenceStaticMethodAdd {
    public static void sayable() {
        System.out.println("I am helping in static reference");
    }
    public static void main(String[] args) {
        Sayable s = ReferenceStaticMethodAdd::sayable;
        s.say();
    }
}
