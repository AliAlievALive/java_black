package collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
//        TreeMap<Student, Double> treeMap = new TreeMap<>();
//        TreeMap<Student, Double> treeMap2 = new TreeMap<>((o1, o2) -> o1.name.compareTo(o2.name));
//
//        Student st1 = new Student("Ali", "Aliev", 3);
//        Student st2 = new Student("Zaur", "Tregulov", 1);
//        Student st3 = new Student("Olya", "Zabelina", 4);
//        Student st4 = new Student("Liya", "Zura", 3);
//        Student st5 = new Student("Petr", "Ivanov", 2);
//        Student st6 = new Student("Ivan", "Petrov", 4);
//        Student st7 = new Student("Lena", "Dsdd", 4);
//        treeMap.put(st1, 5.8);
//        treeMap.put(st7, 9.1);
//        treeMap.put(st2, 6.4);
//        treeMap.put(st4, 7.5);
//        treeMap.put(st3, 7.2);
//        treeMap.put(st6, 8.2);
//        treeMap.put(st5, 7.9);
//
//        Student st8 = new Student("Lena", "Dsdd", 4);
//
//        System.out.println(treeMap);
//        System.out.println(treeMap.containsKey(st8));
//        System.out.println(treeMap.get(7.2));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.headMap(7.3));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Ali", "Aliev", 3);
        Student st2 = new Student("Zaur", "Tregulov", 1);
        Student st3 = new Student("Olya", "Zabelina", 4);
        Student st4 = new Student("Liya", "Zura", 3);
        Student st5 = new Student("Petr", "Ivanov", 2);
        Student st6 = new Student("Ivan", "Petrov", 4);
        Student st7 = new Student("Lena", "Dsdd", 4);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);

        System.out.println(treeMap);
    }
}
