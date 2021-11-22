package multithreading;

public class Ex4 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
//        MyThread5 myThread6 = new MyThread5();
//        System.out.println("Name of myThread6 = " + myThread6.getName() +
//                ", Priority of myThread6 = " + myThread6.getPriority());
        myThread5.setName("my_potok");
        myThread5.setPriority(9);
        System.out.println("Name of myThread5 = " + myThread5.getName() +
                ", Priority of myThread5 = " + myThread5.getPriority());
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("Hi");
    }
}