package main.java.com.aleksey_voronin.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class SemDemo {

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}
