package main.java.com.aleksey_voronin.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class MakeString implements Runnable {
    Exchanger<String> exchanger;
    String str;

    public MakeString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.str = "";
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                str = exchanger.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
