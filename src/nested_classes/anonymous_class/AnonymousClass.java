package nested_classes.anonymous_class;

public class AnonymousClass {
    private int x = 5;
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass();
                return a + b + ac.x;
            }
        };

        Math m2 = (a, b) -> a * b;
        System.out.println(m.doOperation(3, 6));
        System.out.println(m2.doOperation(3, 6));
    }


}

interface Math {
    int doOperation(int a, int b);
}