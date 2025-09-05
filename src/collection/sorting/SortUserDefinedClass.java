package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{

    public String name;


    public Student(String name ){
        this.name = name;
    }
    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }
}
public class SortUserDefinedClass {
    public static void main(String[] args) {
        Student s1 = new Student("Manoj");
        Student s2 = new Student("Navya");
        Student s3 = new Student("Ajay");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(new Student("Viru"));
        students.add(new Student("Saurav"));
        students.add(new Student("Mukesh"));
        students.add(new Student("Tahir"));

        Collections.sort(students);

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()){
            System.out.println("student name: " + itr.next().name);
        }
    }
}
