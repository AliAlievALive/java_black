package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("ok");
//        list.add(5);
//        list.add(new StringBuilder("ertjenjk"));
//        list.add(new Car());
        list.add("dsfds");
        list.add("ok");
        list.add("sdfs");
        list.add("sddddds");
//        list.add(new Car());

        for (Object s : list) {
            System.out.println(s + "dlina " + ((String) s).length());
        }
    }

    private static class Car {
    }
}
