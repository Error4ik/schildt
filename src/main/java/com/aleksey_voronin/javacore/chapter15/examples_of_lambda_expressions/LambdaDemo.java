package main.java.com.aleksey_voronin.javacore.chapter15.examples_of_lambda_expressions;

import main.java.com.aleksey_voronin.javacore.chapter15.examples_of_lambda_expressions.MyNumber;

import static java.lang.Math.*;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.45;
        System.out.println("Фиксированное значение: " + myNumber.getValue());

        myNumber = () -> random() * 100;
        System.out.println("Случайное значение: " + myNumber.getValue());
        System.out.println("Еще одно случайное значение: " + myNumber.getValue());
    }
}
