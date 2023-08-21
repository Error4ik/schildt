package main.java.com.aleksey_voronin.javacore.chapter28.phaser;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 4);
        System.out.println("Запуск потоков");

        new MyThread2(phaser, "A");
        new MyThread2(phaser, "B");
        new MyThread2(phaser, "C");

        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен.");
    }
}
