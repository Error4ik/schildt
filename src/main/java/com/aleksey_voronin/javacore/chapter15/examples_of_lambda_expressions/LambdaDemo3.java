package main.java.com.aleksey_voronin.javacore.chapter15.examples_of_lambda_expressions;

import main.java.com.aleksey_voronin.javacore.chapter15.examples_of_lambda_expressions.NumericTest2;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("Число 2 является множителем числа 10");

        if (!isFactor.test(10, 3))
            System.out.println("Число 3 не является множителем числа 10");
    }
}
