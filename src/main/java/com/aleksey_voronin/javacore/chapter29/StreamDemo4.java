package main.java.com.aleksey_voronin.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 06.08.2023.
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);

        Stream<Double> sqrtRootStream = list.stream().map(a -> Math.sqrt(a));

        double productOfSqrRoots = sqrtRootStream.reduce(1.0, (a, b) -> a * b);

        System.out.println("Произведение квадратных корней равно " + productOfSqrRoots);
    }
}
