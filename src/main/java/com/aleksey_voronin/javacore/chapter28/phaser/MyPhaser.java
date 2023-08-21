package main.java.com.aleksey_voronin.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class MyPhaser extends Phaser {

    int numPhase;

    public MyPhaser(int parties, int numPhase) {
        super(parties);
        this.numPhase = numPhase - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Фаза " + phase + " Завершена.\n");

        if (phase == numPhase || registeredParties == 0) {
            return true;
        }

        return false;
    }
}
