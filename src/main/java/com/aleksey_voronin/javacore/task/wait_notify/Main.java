package main.java.com.aleksey_voronin.javacore.task.wait_notify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Alexey Voronin.
 * @since 18.08.2023.
 */
public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new ThreadC(foo));
        executorService.submit(new ThreadA(foo));
        executorService.submit(new ThreadB(foo));

        executorService.shutdown();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
    }
}
