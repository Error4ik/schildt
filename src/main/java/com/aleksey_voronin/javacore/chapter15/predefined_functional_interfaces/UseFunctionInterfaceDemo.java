package main.java.com.aleksey_voronin.javacore.chapter15.predefined_functional_interfaces;

import java.util.function.Function;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Факториал числа 3 равен " + factorial.apply(3));
        System.out.println("Факториал числа 5 равен " + factorial.apply(5));
    }
}
