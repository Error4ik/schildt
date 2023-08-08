package main.java.com.aleksey_voronin.javacore.chapter15.references_to_static_methods;

import main.java.com.aleksey_voronin.javacore.chapter15.block_lambda_expressions.StringFunc;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MethodDemo {
    static String stringIo(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        outStr = stringIo(MyStringOps::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
