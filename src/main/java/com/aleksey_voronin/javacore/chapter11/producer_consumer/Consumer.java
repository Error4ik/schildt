package main.java.com.aleksey_voronin.javacore.chapter11.producer_consumer;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
