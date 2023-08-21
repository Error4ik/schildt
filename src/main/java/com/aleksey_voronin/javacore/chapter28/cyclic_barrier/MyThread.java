package main.java.com.aleksey_voronin.javacore.chapter28.cyclic_barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class MyThread implements Runnable {

    CyclicBarrier barrier;
    String name;

    public MyThread(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
        new Thread(this).start();
    }


    @Override
    public void run() {
        System.out.println(name);

        try {
            barrier.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            System.out.println(e);
        }
    }
}
