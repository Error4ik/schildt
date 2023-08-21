package main.java.com.aleksey_voronin.javacore.chapter28.cyclic_barrier;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут.");
    }
}
