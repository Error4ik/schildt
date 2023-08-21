package main.java.com.aleksey_voronin.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class DecThread implements Runnable {
    Semaphore sem;
    String name;

    public DecThread(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока: " + name);
        try {
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешения");
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}
