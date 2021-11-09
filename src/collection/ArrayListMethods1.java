package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Maryam");
        arrayList1.add("Ivan");
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
//        System.out.println(arrayList1.get(2));
//        for (int i = 0; i < arrayList1.size(); i++) {
//            System.out.println(arrayList1.get(i));
//        }
        arrayList1.set(1, "Alim");
        arrayList1.remove("Ivan");
        System.out.println(arrayList1);
    }
}
