package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Zaur");
        list.add("Bill");
        System.out.println("Undo sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sort");
        System.out.println(list);
    }
}
