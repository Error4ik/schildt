package main.java.com.aleksey_voronin.javacore.chapter11.thread;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class NewThread extends Thread {

    NewThread() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + this);
                Thread.sleep(500);
            };
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
