package main.java.com.aleksey_voronin.javacore.chapter15.references_to_generalized_methods;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}
