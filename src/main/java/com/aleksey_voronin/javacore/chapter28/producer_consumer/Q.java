package main.java.com.aleksey_voronin.javacore.chapter28.producer_consumer;

import java.util.concurrent.Semaphore;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class Q {
    int n;
    static Semaphore semCons = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCons.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа InterruptedException");
        }
        System.out.println("Получено: " + n);
        semProd.release();
    }

    void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа InterruptedException");
        }
        this.n = n;
        System.out.println("Отправлено: " + n);
        semCons.release();
    }
}
