package main.java.com.aleksey_voronin.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class MyThread2 implements Runnable {
    Phaser phaser;
    String name;

    public MyThread2(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
