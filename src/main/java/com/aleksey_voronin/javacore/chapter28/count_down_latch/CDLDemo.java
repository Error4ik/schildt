package main.java.com.aleksey_voronin.javacore.chapter28.count_down_latch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("Запуск потока исполнения");

        new MyThread(cdl);

        try {
            cdl.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Завершение потока исполнения");
    }
}
