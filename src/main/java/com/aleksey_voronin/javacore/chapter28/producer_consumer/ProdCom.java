package main.java.com.aleksey_voronin.javacore.chapter28.producer_consumer;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class ProdCom {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
