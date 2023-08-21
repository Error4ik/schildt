package main.java.com.aleksey_voronin.javacore.chapter11.main_thread;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + t);

        t.setName("My Thread");

        System.out.println("После изменения имени потока: " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
            Thread.currentThread().interrupt();
        }
    }
}
