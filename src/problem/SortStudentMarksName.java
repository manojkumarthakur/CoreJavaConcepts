package problem;

/*
Sort on Marks first and if same on the name
* Student string
*Manoj-0#Ajay-0#Rahul-50#Ramesh-60
* */
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student other) {
        // Sort by marks in ascending order
        if (this.mark != other.mark) {
            return Integer.compare(this.mark, other.mark);
        }
        // If marks are the same, sort by name in ascending order
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + "#" + mark;
    }
}

public class SortStudentMarksName {
    public static void main(String[] args) {
//        String input = "Alice#85-Bob#92-Charlie#85-David#78"; // Example input
        String input = "Alice#0-Bob#0-Charlie#85-David#78"; // Example input

        List<Student> students = new ArrayList<>();
        String[] pairs = input.split("-");

        for (String pair : pairs) {
            String[] parts = pair.split("#");
            String name = parts[0];
            int mark = Integer.parseInt(parts[1]);
            students.add(new Student(name, mark));
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
