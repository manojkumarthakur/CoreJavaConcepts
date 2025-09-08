package concept.abstraction;
interface Printable1{
    void print();
}
interface Showable extends Printable1{
    void show();
}
public class InheritanceOfInterfaces implements Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String[] args) {
        InheritanceOfInterfaces i = new InheritanceOfInterfaces();
        i.print();
        i.show();
    }
}
