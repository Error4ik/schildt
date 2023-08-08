package main.java.com.aleksey_voronin.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 06.08.2023.
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(18);
        list.add(10);
        list.add(24);
        list.add(17);
        list.add(5);

        Optional<Integer> productObj = list.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent()) {
            System.out.println("Произведение в виде объекта типа Optional: " + productObj.get());
        }

        int product = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Произведение в виде значение тпа int: " + product);

    }
}
