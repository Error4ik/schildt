package main.java.com.aleksey_voronin.javacore.chapter15.references_to_constructors;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MyClass {
    private int val;

    public MyClass(int v) {
        val = v;
    }

    public MyClass() {
        val = 0;
    }

    public int getVal() {
        return val;
    }
}
