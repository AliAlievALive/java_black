package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadFactory threadFactory;
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();
    }
}

class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}