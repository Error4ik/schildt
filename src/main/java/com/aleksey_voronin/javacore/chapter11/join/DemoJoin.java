package main.java.com.aleksey_voronin.javacore.chapter11.join;

/**
 * @author Alexey Voronin.
 * @since 20.08.2023.
 */
public class DemoJoin {
    public static void main(String[] args) {
        NewThread one = new NewThread("One");
        NewThread two = new NewThread("Two");
        NewThread three = new NewThread("Three");

        System.out.println("Поток Один запущен: " + one.t.isAlive());
        System.out.println("Поток Два запущен: " + two.t.isAlive());
        System.out.println("Поток Три запущен: " + three.t.isAlive());

        try {
            System.out.println("Ожидагние завершения потоков.");
            one.t.join();
            two.t.join();
            three.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный потко прерван");
        }

        System.out.println("Поток Один запущен: " + one.t.isAlive());
        System.out.println("Поток Два запущен: " + two.t.isAlive());
        System.out.println("Поток Три запущен: " + three.t.isAlive());

        System.out.println("Главный поток завершен");
    }
}
