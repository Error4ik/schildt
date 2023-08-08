package main.java.com.aleksey_voronin.javacore.chapter15.references_to_static_methods;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
