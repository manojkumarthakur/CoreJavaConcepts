package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*Java 8 Comparator interface is a functional interface that contains only one abstract method.
Now, we can use the Comparator interface as the assignment target for a lambda expression or method reference.
* */
public class ComparatorExampleJava8 {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Comparator<Student> cm1 = Comparator.comparing(Student::getName);
        Collections.sort(al, cm1);
        System.out.println("Sorting by Age");
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
//Sorting elements on the basis of age
        Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
        Collections.sort(al, cm2);
        System.out.println("Sorting by Age");
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
