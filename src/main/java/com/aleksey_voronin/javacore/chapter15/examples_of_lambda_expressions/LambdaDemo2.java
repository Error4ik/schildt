package main.java.com.aleksey_voronin.javacore.chapter15.examples_of_lambda_expressions;

import main.java.com.aleksey_voronin.javacore.chapter15.examples_of_lambda_expressions.NumericTest;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("Число 10 четноё");
        if (!isEven.test(9)) System.out.println("Число 9 нечетноё");

        NumericTest isNonNeg = n -> n > 0;
        if (isNonNeg.test(1)) System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test(-1)) System.out.println("Число -1 отрицательное");
    }
}
