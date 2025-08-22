package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class UserDefinedClass {
    public static void main(String[] args) {

        //Creating user-defined class objects
        Student s1 = new Student(1, "Manoj", 40);
        Student s2 = new Student(1, "Navya", 35);
        Student s3 = new Student(1, "Adriti", 7);
        Student s4 = new Student(1, "Rishu", 1);

        //creating arraylist
        List<Student> students = new ArrayList<>();
        students.add(s1); //adding Student class object
        students.add(s2);
        students.add(s3);
        students.add(s2);

        System.out.println(students); //Objects of student

        // Accessing
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()){
            Student s = itr.next();
            System.out.println(s.rollno +" "+ s.name + " "+ s.age);
        }


    }
}
