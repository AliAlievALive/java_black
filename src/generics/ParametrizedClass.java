package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<Integer> info1 = new Info<>(18);
        System.out.println(info1);
        Integer i1 = info1.getValue();

        Info<Double> info2 = new Info<>(3.14);
        System.out.println(info2);
        Double i2 = info2.getValue();
    }
}

class Info<T extends Number> {
    private T value;
    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[ " + value + " ]}";
    }

    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}
