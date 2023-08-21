package main.java.com.aleksey_voronin.javacore.chapter11.producer_consumer;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class Q {
    int n;

    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(
                        "Исключение типа  InterruptedException перехвачено");
            }
        }
        System.out.println("Получено : " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(
                        "Исключение типа  InterruptedException перехвачено");
            }
        }
        this.n = n;
        valueSet = true;
        notify();
        System.out.println("Отправлено: " + n);
    }
}
