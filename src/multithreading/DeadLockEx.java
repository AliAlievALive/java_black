package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: try catch monitor of object lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: monitor of object lock1 is caught");
            System.out.println("Thread10: try catch monitor of object lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: monitor of object lock1 and lock2 is caught");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: try catch monitor of object lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Thread20: monitor of object lock2 is caught");
            System.out.println("Thread20: try catch monitor of object lock1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Thread20: monitor of object lock1 and lock1 is caught");
            }
        }
    }
}