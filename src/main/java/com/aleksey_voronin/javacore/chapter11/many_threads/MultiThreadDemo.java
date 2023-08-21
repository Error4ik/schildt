package main.java.com.aleksey_voronin.javacore.chapter11.many_threads;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный потко прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
