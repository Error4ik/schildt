package main.java.com.aleksey_voronin.javacore.chapter15.references_to_constructors;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MyClass2<T> {
    private T val;

    public MyClass2(T v) {
        val = v;
    }

    public MyClass2() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
