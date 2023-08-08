package main.java.com.aleksey_voronin.javacore.chapter15.references_to_generalized_methods;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public interface MyFunc<T> {
    int func(T[] vals, T v);
}
