package main.java.com.aleksey_voronin.javacore.chapter11.suspend_resume_stop_threads;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class SuspendResume {
    public static void main(String[] args) {
        NewThread one = new NewThread("One");
        NewThread two = new NewThread("Two");

        try {
            Thread.sleep(1000);
            one.mySuspend();
            System.out.println("Приостановка потока One");
            Thread.sleep(1000);
            one.myResume();
            System.out.println("Возобновление потока One");
            two.mySuspend();
            System.out.println("Приостановка потока Two");
            Thread.sleep(1000);
            two.myResume();
            System.out.println("Возобновление потока Two");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        try {
            System.out.println("Ожидание завершения потоков");
            one.t.join();
            two.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");
    }
}
