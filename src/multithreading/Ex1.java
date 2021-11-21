package multithreading;

public class Ex1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        Ex1 thread = new Ex1();
        thread.start();

        for (int i = 1000; i >0; i--) {
            System.out.println(i);
        }

//        MyThread1 myThread1 = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
//        myThread2.start();
//        myThread1.start();
    }
}

//class MyThread1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//
//        }
//    }
//}
//
//class MyThread2 extends Thread {
//    public void run() {
//        for (int i = 1000; i >0; i--) {
//            System.out.println(i);
//
//        }
//    }
//}