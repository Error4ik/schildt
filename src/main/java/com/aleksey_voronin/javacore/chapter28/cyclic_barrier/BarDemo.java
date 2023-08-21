package main.java.com.aleksey_voronin.javacore.chapter28.cyclic_barrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread(barrier, "A");
        new MyThread(barrier, "B");
        new MyThread(barrier, "C");
    }
}
