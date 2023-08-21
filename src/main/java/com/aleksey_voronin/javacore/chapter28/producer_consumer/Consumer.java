package main.java.com.aleksey_voronin.javacore.chapter28.producer_consumer;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}
