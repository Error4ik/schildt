package main.java.com.aleksey_voronin.javacore.chapter15.lambda_expressions_and_variable_capture;

import main.java.com.aleksey_voronin.javacore.chapter15.lambda_expressions_and_variable_capture.MyFunc;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class VarCapture {
    public static void main(String[] args) {
        final int num = 10 ;
        MyFunc myLamЬda = (n) -> {
            int v = num + n ;
//            num++;
            return v ;
        };
//        num = 9;
    }
}
