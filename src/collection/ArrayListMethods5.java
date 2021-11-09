package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Maryam");
        arrayList1.add("Ivan");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        List<Integer> list = List.of(3, 8, 13);
        System.out.println(list);

        List<String> list2 = List.copyOf(arrayList1);

        System.out.println(list2);

//        list.add(100); UnsupportedOperationException

//        System.out.println("ArrayList = " + arrayList1);

//        Object[] arr = arrayList1.toArray();
//        String[] arr2 = arrayList1.toArray(new String[0]);
//        for (String s : arr2) {
//            System.out.println(s);
//        }

//        List<String> myList = arrayList1.subList(1, 4);
//        System.out.println("SubList = " + myList);
//        myList.add("Fedor");
//        System.out.println("SubList = " + myList);
//        System.out.println("ArrayList = " + arrayList1);
////        arrayList1.add("Sveta");  ConcurrentModificationException
//        System.out.println("ArrayList = " + arrayList1);
//        System.out.println("SubList = " + myList);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Maryam");
//        arrayList2.add("Igor");

//        arrayList1.removeAll(arrayList2);
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);
    }
}
