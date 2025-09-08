package strings;

 final class Employee {
    final String pancardNumber;

    public Employee(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }
}
/*
* We can also create immutable class by creating final class that have final data members
*  It have one final data member, a parameterized constructor and getter method.
 * */
public class ImmutableDemo {
    public static void main(String ar[]) {
        Employee e = new Employee("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);
    }
}