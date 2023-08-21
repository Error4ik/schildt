package main.java.com.aleksey_voronin.javacore.chapter11.suspend_resume_stop_threads;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Прерван");
        }
        System.out.println(name + " Завершен");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
        notify();
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}
