package main.java.com.aleksey_voronin.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new UseString(exchanger);
        new MakeString(exchanger);
    }
}
