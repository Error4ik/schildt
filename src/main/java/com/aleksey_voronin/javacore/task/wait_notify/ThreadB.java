package main.java.com.aleksey_voronin.javacore.task.wait_notify;

/**
 * @author Alexey Voronin.
 * @since 18.08.2023.
 */
public class ThreadB implements Runnable {

    private final Foo foo;

    public ThreadB(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        while (foo.getA() != 2) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
                Thread.currentThread().interrupt();
            }
        }
        foo.second();
        foo.setA(foo.getA() + 1);
        notifyAll();
    }
}
