package main.java.com.aleksey_voronin.javacore.chapter28.producer_consumer;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.put(i);
        }
    }
}
