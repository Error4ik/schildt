package main.java.com.aleksey_voronin.javacore.chapter15.lambda_expressions_and_exceptions;

import main.java.com.aleksey_voronin.javacore.chapter15.lambda_expressions_and_exceptions.DoubleNumericArrayFunc;
import main.java.com.aleksey_voronin.javacore.chapter15.lambda_expressions_and_exceptions.EmptyArrayException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        DoubleNumericArrayFunc average = n -> {
            double sum = 0;
            if (n.length == 0) {
                throw new EmptyArrayException();
            }

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };

        System.out.println("Среднее равно " + average.func(values));
        System.out.println("Среднее равно " + average.func(new double[0]));
    }
}
