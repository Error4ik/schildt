package main.java.com.aleksey_voronin.javacore.chapter15.block_lambda_expressions;

import main.java.com.aleksey_voronin.javacore.chapter15.block_lambda_expressions.NumericFunc;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Факториал 3 равен " + factorial.func(3));
        System.out.println("Факториал 5 равен " +factorial.func(5));
    }
}
