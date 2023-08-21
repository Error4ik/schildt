package main.java.com.aleksey_voronin.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated()) {
            System.out.println("Синхронизатор фаз завершен");
        }
    }
}
