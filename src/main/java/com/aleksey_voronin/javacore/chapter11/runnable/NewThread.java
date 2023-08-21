package main.java.com.aleksey_voronin.javacore.chapter11.runnable;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class NewThread implements Runnable {
    Thread t;

    public NewThread() {
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }

    @Override
    public void run() {
       try {
           for (int i = 5; i > 0; i--) {
               System.out.println("Дочерний поток: " + t);
               Thread.sleep(500);
           };
       } catch (InterruptedException e) {
           System.out.println("Дочерний поток прерван.");
       }
        System.out.println("Дочерний поток завершен.");
    }
}
