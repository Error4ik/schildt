package main.java.com.aleksey_voronin.javacore.chapter15.block_lambda_expressions;

import main.java.com.aleksey_voronin.javacore.chapter15.block_lambda_expressions.StringFunc;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = str -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));
    }
}
