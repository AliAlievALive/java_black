package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(3);
        set1.add(2);
        set1.add(1);
        set1.add(8);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(5);
        set2.add(3);
        set2.add(8);

//        HashSet<Integer> union = new HashSet<>(set1);
//        union.addAll(set2);

//        HashSet<Integer> intersect = new HashSet<>(set1);
//        intersect.retainAll(set2);

        HashSet<Integer> subtract = new HashSet<>(set1);
        subtract.removeAll(set2);

        System.out.println(subtract);
    }
}
