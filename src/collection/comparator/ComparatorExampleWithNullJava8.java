package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExampleWithNullJava8 {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,null,21));

        Comparator<Student> cm1 = Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
        Collections.sort(al, cm1);
        System.out.println("Sorting by name null is first");
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
        Comparator<Student> cm3 = Comparator.comparing(Student::getName, Comparator.nullsLast(String::compareTo));
        Collections.sort(al, cm3);
        System.out.println("Sorting by name null is last");
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
