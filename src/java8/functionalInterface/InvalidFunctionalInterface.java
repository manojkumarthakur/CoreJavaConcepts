package java8.functionalInterface;

interface sayable{
    void say(String msg);   // abstract method
}

//@FunctionalInterface // Uncomment this to see errors
public interface InvalidFunctionalInterface extends  sayable{
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface
    void doit();
}
