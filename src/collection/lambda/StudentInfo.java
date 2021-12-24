package collection.lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> arrayList, StudentChecks studentChecks) {
        for (Student student : arrayList) {
            if (studentChecks.check(student)) {
                System.out.println(student);
            }
        }
    }
//    void printStudentOverGrade(ArrayList<Student> arrayList, double grade) {
//        for (Student student : arrayList) {
//            if (student.avgGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> arrayList, int age) {
//        for (Student student : arrayList) {
//            if (student.age < age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentMixConditions(ArrayList<Student> arrayList, int age, double grade, char sex) {
//        for (Student student : arrayList) {
//            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("------------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student student) {
//                return student.age < 30;
//            }
//        });
        info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});
        System.out.println("------------------------");
        info.testStudents(students, (Student s) -> {return s.age < 30;});
        System.out.println("------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';});
//        info.printStudentOverGrade(students, 8);
//        System.out.println("------------------------");
//        info.printStudentUnderAge(students, 30);
//        System.out.println("------------------------");
//        info.printStudentMixConditions(students, 20, 9.5, 'f');
    }
}

interface StudentChecks {
    boolean check(Student student);
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student student) {
        return student.avgGrade > 8;
    }
}