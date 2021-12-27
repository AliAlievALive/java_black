package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Optional<Student> min = students.stream().min((x, y) -> x.getAge() - y.getAge());
        Student student1 = min.orElse(null);
        System.out.println(student1);

        Student student2 = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(student2);
    }
}
