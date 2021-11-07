package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ali", "Tregulov", 2000));
        list.add(new Employee(56, "Zaur", "Aliev", 2333));
        list.add(new Employee(23, "Bill", "Ivanov", 1000));
        System.out.println("Undo sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sort");
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}