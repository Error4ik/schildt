package main.java.com.aleksey_voronin.javacore.chapter11.producer_consumer;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
