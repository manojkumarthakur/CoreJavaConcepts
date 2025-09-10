package concept.Inheritance;
class A{
    public void m() {
        System.out.println("I am m from A");
    }
}
class B extends A{
    public void m() {
        System.out.println("I am m from B");
    }

    public void n() {
        System.out.println("I am n from B");
    }
}
public class CheckInstanceUseMethod {
    public static void main(String[] args) {
        A a= new B();
        a.m();
//        a.n(); // Cannot access method of child class

        B b = new B();
        b.m();
        b.n();
    }
}
