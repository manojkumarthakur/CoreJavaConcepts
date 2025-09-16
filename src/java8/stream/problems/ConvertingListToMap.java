package java8.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    // Constructor, getters

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ConvertingListToMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "Alice"), new Employee(2, "Bob"));
        Map<Integer, String> emp = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(emp);
    }
}
