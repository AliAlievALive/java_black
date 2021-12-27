package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.);
        list.add(5.);
        list.add(1.);
        list.add(0.25);

        Double sumRes = list.stream().reduce((accum, element) -> accum + element).get();
        System.out.println("sumResult" + sumRes);

        Double sumResPS = list.parallelStream().reduce((accum, element) -> accum + element).get();
        System.out.println("sumResult" + sumResPS);

        Double divRes = list.stream().reduce((accum, element) -> accum / element).get();
        System.out.println("sumResult" + divRes);

        Double divResPS = list.parallelStream().reduce((accum, element) -> accum / element).get(); // Not correct working
        System.out.println("sumResult" + divResPS);
    }
}
