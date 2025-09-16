package java8.functionalInterface;

interface Doable{
    default void doit(){
        System.out.println("doit");
    }
}

@FunctionalInterface
interface Do extends Doable {
    abstract void doo(String msg);  // abstract method
}
public class FunctionalInterfaceExtendingNonFunctional implements Do{
    public void doo(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Do d = new FunctionalInterfaceExtendingNonFunctional();
        d.doo("Manoj");

    }
}
