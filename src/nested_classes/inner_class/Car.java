package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    //    public Car(String color, int doorCount, int horsePower) {
    //        this.color = color;
    //        this.doorCount = doorCount;
    //        this.engine = this.new Engine(horsePower);
    //    }
    public Car(String color, int doorCount) {
//        Engine engine = new Engine(200);
//        System.out.println(engine.horsePower);
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
//        Car car = new Car("Black", 4, 300);
//        System.out.println(car);
        Car car = new Car("Black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

//        Car.Engine engine3 = new Car("yellow", 4).new Engine(200); Dont know car object

//        Car.Engine engine2 = new car.Engine(150); No reason
    }
}