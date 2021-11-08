package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Maryam");
        arrayList1.add("Ivan");
        System.out.println(arrayList1);
        List<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
    }
}
