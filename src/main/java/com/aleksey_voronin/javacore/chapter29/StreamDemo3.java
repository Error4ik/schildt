package main.java.com.aleksey_voronin.javacore.chapter29;

import java.util.ArrayList;

import static java.lang.Math.*;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 06.08.2023.
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(18);
        list.add(10);
        list.add(24);
        list.add(17);
        list.add(5);

        double productOfSqrRoots =
                list.parallelStream().reduce(1.0, (a ,b) -> a * sqrt(b), (a, b) -> a * b);

        System.out.println("Произведение квадратных корней: " + productOfSqrRoots);
    }
}
