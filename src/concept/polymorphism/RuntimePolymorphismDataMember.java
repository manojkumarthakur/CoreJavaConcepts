package concept.polymorphism;
/*Rule: Runtime polymorphism can't be achieved by data members.
* */
class Bike1{
    int speedlimit=90;
}
class Honda extends Bike1{
    int speedlimit=150;
}
public class RuntimePolymorphismDataMember {
    public static void main(String[] args) {
        Bike1 b1 = new Honda();
        System.out.println(b1.speedlimit); //90
    }
}
