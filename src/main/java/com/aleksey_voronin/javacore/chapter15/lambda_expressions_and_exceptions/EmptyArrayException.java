package main.java.com.aleksey_voronin.javacore.chapter15.lambda_expressions_and_exceptions;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class EmptyArrayException extends Exception {
    public EmptyArrayException() {
        super("Массив пуст.");
    }
}
