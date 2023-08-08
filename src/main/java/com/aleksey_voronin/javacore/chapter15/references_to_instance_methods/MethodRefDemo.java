package main.java.com.aleksey_voronin.javacore.chapter15.references_to_instance_methods;

import main.java.com.aleksey_voronin.javacore.chapter15.block_lambda_expressions.StringFunc;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOps strOps = new MyStringOps();

        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
