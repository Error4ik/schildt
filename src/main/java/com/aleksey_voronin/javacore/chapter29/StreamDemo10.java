package main.java.com.aleksey_voronin.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 06.08.2023.
 */
public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> myStream = myList.stream();

        Spliterator<String> split = myStream.spliterator();

        Spliterator<String> split2 = split.trySplit();

        if (split2 != null) {
            System.out.println("Результат, выводимый итератором split2 ");
            split2.forEachRemaining(n -> System.out.println(n));
        }

        System.out.println("\nРезультат, выводимый итератором split ");
        split.forEachRemaining(n -> System.out.println(n));
    }
}
