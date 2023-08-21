package main.java.com.aleksey_voronin.javacore.chapter11.runnable;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            };
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
