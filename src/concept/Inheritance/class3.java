package concept.Inheritance;

interface Interface1{
    public void m1();
}
class Class2{
    public void m1(){
        System.out.println("I am from class2 ");
    }
}
class Class1 extends Class2 implements Interface1{

    @Override
    public void m1(){
        System.out.println("I am from class1 ");
    }
}

interface Interface2{
    public void m2();
}

class Class4 implements Interface1, Interface2{

    @Override
    public void m1() {
        System.out.println("m1 From class 4");
    }

    @Override
    public void m2() {
        System.out.println("m2 From class 4");
    }
}
public class class3 extends Class1{
    public static void main(String[] args) {
        // Class 1 extends Class2, Interface1 both have m1() method and now class3 extends class1.`

        Class1 c1 = new class3();
        c1.m1();

        Class2 c2 = new Class1();
        c2.m1();

        Interface1 i1 = new Class1();
        i1.m1();


        //class1 extends interface1, interface2 have m1 and m2 method respectively. Now instantiate Inteface1 it= new Class1(). Will it work?

        Interface1 class4 = new Class4();
        class4.m1();
    }
}
