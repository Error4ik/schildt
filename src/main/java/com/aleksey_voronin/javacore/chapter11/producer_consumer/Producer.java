package main.java.com.aleksey_voronin.javacore.chapter11.producer_consumer;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
