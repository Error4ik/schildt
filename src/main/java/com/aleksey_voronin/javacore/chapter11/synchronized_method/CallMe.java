package main.java.com.aleksey_voronin.javacore.chapter11.synchronized_method;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class CallMe {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}
