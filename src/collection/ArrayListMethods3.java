package collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Maryam");
        arrayList1.add("Ivan");
        arrayList1.add("Maryam");
        System.out.println(arrayList1);

        System.out.println(arrayList1.indexOf("Maryam"));
        System.out.println(arrayList1.lastIndexOf("Maryam"));

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("&&&");
        arrayList2.add("???");
        System.out.println(arrayList2);

        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

        arrayList1.clear();
        System.out.println(arrayList1.size());
        System.out.println(arrayList1);
    }
}
