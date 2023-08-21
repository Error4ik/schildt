package main.java.com.aleksey_voronin.javacore.task.count_down_latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Alexey Voronin.
 * @since 18.08.2023.
 */
public class Main {
    public static void main(String[] args) {
        CountDownLatch cdl1 = new CountDownLatch(1);
        CountDownLatch cdl2 = new CountDownLatch(2);
        Foo foo = new Foo();
        System.out.println();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new ThreadA(cdl1, cdl2, foo));
        executorService.submit(new ThreadC(cdl1, cdl2, foo));
        executorService.submit(new ThreadB(cdl1, cdl2, foo));

        executorService.shutdown();
    }
}
