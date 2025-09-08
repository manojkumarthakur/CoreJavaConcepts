package concept.polymorphism;
/*In Java, method overloading is used to achieve compile-time polymorphism. A class can have numerous methods with the same name but distinct parameter lists thanks to method overloading. The compiler uses the amount and kind of parameters provided to it during compilation to decide which method to call. This choice is made during compilation, which is why it's called "compile-time polymorphism."
* */
class Calculation {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimeExample {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        System.out.println(cal.add(1,2));
        System.out.println(cal.add(1.3,2));
    }
}
