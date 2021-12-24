package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        Integer result = list.stream().reduce((accum, element) -> accum * element).get();
//        System.out.println(result);

//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> reduce = list.stream().reduce((accum, element) -> accum * element);
//        if (reduce.isPresent()) {
//            System.out.println(reduce.get());
//        } else {
//            System.out.println("Not present");
//        }

        Integer result2 = list.stream().reduce(1, (accum, element) -> accum * element);
        System.out.println(result2);

        List<String> list3 = new ArrayList<>();
        list3.add("Privet");
        list3.add("Kak dela?");
        list3.add("Ok");
        list3.add("poka");
        String res3 = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(res3);
    }
}
