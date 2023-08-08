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
public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> myStream = myList.stream();

        Spliterator<String> spliterator = myStream.spliterator();

        while (spliterator.tryAdvance(System.out::println)) ;
    }
}
