package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
        int result = Arrays.stream(array).filter(value -> value % 2 == 1)
                .map(operand -> {
                    if (operand % 3 == 0) {
                        operand /= 3;
                    }
                    return operand;
                })
                .reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);
    }
}
