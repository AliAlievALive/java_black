package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

//    @Override
//    public void run() {
//        try {
//            System.out.println(name + " wait... ");
//            lock.lock();
//            System.out.println(name + " use bankomat");
//            Thread.sleep(2000);
//            System.out.println(name + " end works");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        finally {
//            lock.unlock();
//        }
//    }
    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(name + " use bankomat");
                Thread.sleep(2000);
                System.out.println(name + " end works");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " don't want wait ");
        }
    }
}