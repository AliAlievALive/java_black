package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add("hello"); Нельзя изменять объекты wildcard
        List<? extends Number> list3 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.);
        list1.add(3.4);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("3.14");
        list2.add("3.");
        list2.add("3.4");
        showListInfo(list2);

        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(3.14);
        arrayList.add(2.14);
        arrayList.add(1.1);
        System.out.println(summ(arrayList));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(2);
        arrayList1.add(1);
        System.out.println(summ(arrayList1));
    }

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    public static double summ(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for (Number n : arrayList) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
