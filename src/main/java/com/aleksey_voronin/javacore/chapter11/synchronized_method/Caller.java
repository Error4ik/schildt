package main.java.com.aleksey_voronin.javacore.chapter11.synchronized_method;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class Caller implements Runnable {

    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe tar, String s) {
        target = tar;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
