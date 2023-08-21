package main.java.com.aleksey_voronin.javacore.task.wait_notify;

/**
 * @author Alexey Voronin.
 * @since 18.08.2023.
 */
public class ThreadC implements Runnable {

    private final Foo foo;

    public ThreadC(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        while (foo.getA() != 3) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
                Thread.currentThread().interrupt();
            }
        }
        foo.third();
        foo.setA(1);
        notifyAll();
    }
}
