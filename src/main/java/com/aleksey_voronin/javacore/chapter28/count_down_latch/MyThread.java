package main.java.com.aleksey_voronin.javacore.chapter28.count_down_latch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class MyThread implements Runnable {

    CountDownLatch cdl;

    public MyThread(CountDownLatch cdl) {
        this.cdl = cdl;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            cdl.countDown();
        }
    }
}
