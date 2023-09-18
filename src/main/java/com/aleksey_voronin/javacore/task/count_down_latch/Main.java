package main.java.com.aleksey_voronin.javacore.task.count_down_latch;

import java.util.concurrent.CompletableFuture;

/**
 * @author Alexey Voronin.
 * @since 18.08.2023.
 */
public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();

        CompletableFuture.runAsync(() -> {
            foo.second(() -> {
            });
        });
        CompletableFuture.runAsync(() -> {
            foo.first(() -> {
            });
        });
        CompletableFuture.runAsync(() -> {
            foo.third(() -> {
            });
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
    }
}
