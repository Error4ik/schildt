package main.java.com.aleksey_voronin.javacore.task.count_down_latch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Alexey Voronin.
 * @since 18.08.2023.
 */
public class Foo {

    private final CountDownLatch cdl1;
    private final CountDownLatch cdl2;

    public Foo() {
        this.cdl1 = new CountDownLatch(1);
        this.cdl2 = new CountDownLatch(1);
    }

    public void first(Runnable runnable) {
        System.out.print("first");
        cdl1.countDown();
    }

    public void second(Runnable runnable) {
        try {
            cdl1.await();
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
        System.out.print("second");
        cdl2.countDown();
    }

    public void third(Runnable runnable) {
        try {
            cdl2.await();
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
        System.out.print("third\n");
    }
}
