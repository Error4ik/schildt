package main.java.com.aleksey_voronin.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class UseString implements Runnable {
    Exchanger<String> exchanger;
    String str;

    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = exchanger.exchange("");
                System.out.println("Получено: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
