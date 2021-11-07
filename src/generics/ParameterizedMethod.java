package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
    }
}

class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}