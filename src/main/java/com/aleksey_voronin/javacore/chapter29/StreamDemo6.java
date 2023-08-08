package main.java.com.aleksey_voronin.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 06.08.2023.
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.1);
        list.add(3.6);
        list.add(9.2);
        list.add(4.7);
        list.add(12.1);
        list.add(5.0);

        System.out.println("Исходные значения из списка list ");
        list.stream().forEach(a -> System.out.print(a + " "));
        System.out.println();

        IntStream cStrm = list.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.println("Максимально допустимые пределы значений из списка list ");
        cStrm.forEach(a -> System.out.print(a + " "));
    }
}
