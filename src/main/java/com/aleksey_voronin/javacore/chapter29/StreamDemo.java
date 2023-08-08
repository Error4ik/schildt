package main.java.com.aleksey_voronin.javacore.chapter29;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 06.08.2023.
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(18);
        list.add(10);
        list.add(24);
        list.add(17);
        list.add(5);

        System.out.println("Исходный список " + list);

        Stream<Integer> myStream = list.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()) {
            System.out.println("Минимальное значение " + minVal.get());
        }

        myStream = list.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) {
            System.out.println("Максимальное значение " + maxVal.get());
        }

        Stream<Integer> sortedStream = list.stream().sorted();

        System.out.println("Отсортированный поток данных ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = list.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.println("Нечетные значения.");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        oddVals = list.stream()
                .filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
        System.out.println("Нечетные числа больше 5");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
