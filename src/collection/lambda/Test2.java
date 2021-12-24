package collection.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        def(() -> {return 18;});
        def(() -> 18);
    }
}





interface T {
    int abc(String s);
}

class Test3 {
    static void def(T t) {
        System.out.println(t.abc("privet"));
    }

    public static void main(String[] args) {
        int i = 10;
        // i = 15 нельзя менять, а то лямбда будет ругаться
        def((String s) -> {
            System.out.println(i);
            return s.length() + i;});
    }
}

interface I {
    int abc();
}