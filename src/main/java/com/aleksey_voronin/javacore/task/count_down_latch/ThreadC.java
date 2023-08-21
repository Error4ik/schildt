package main.java.com.aleksey_voronin.javacore.task.count_down_latch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Alexey Voronin.
 * @since 18.08.2023.
 */
public class ThreadC implements Runnable {

    private final CountDownLatch cdl1;
    private final CountDownLatch cdl2;
    private final Foo foo;

    public ThreadC(CountDownLatch cdl1, CountDownLatch cdl2, Foo foo) {
        this.cdl1 = cdl1;
        this.cdl2 = cdl2;
        this.foo = foo;
    }

    @Override
    public void run() {
        try {
            cdl2.await();
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
        foo.third();
    }
}
