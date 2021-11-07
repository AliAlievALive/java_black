package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info = new Info<>("Privet");
        System.out.println(info);
        String s = info.getValue();

        Info<Integer> info1 = new Info<>(18);
        System.out.println(info1);
        Integer i1 = info1.getValue();
    }
}

class Info<T> {
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
