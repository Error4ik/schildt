package main.java.com.aleksey_voronin.javacore.task.wait_notify;

/**
 * @author Alexey Voronin.
 * @since 18.08.2023.
 */
public class Foo {

    private volatile int a = 1;

    public void first() {
        System.out.print("first");
    }

    public void second() {
        System.out.print("second");
    }

    public void third() {
        System.out.print("third\n");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
