package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Ali Aliev");
        map1.put(1342, "Ivan Ivanov");
        map1.put(4544, "Lil Oleva");
        map1.put(5544, "Ivan Mirov");
        map1.putIfAbsent(1000, "Oleg Olegov");
        System.out.println(map1);
//        System.out.println(map1.get(1001));
        map1.remove(5544);
//        System.out.println(map1);
//        System.out.println(map1.containsValue("Ali Aliev"));
//        System.out.println(map1.containsKey(1000));
//        System.out.println(map1.keySet());
        System.out.println(map1.values());
        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Zloy");
        map2.put("Almir", "Umniy");
        System.out.println(map2);
    }
}
