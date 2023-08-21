package main.java.com.aleksey_voronin.javacore.chapter11.synchronized_method;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class Synch {
    public static void main(String[] args) {
        CallMe callme = new CallMe();
        Caller one = new Caller(callme, "Добро пожаловать");
        Caller two = new Caller(callme, "в синхронизованный");
        Caller three = new Caller(callme, "мир!");

        try {
            one.t.join();
            two.t.join();
            three.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
