package main.java.com.aleksey_voronin.javacore.chapter13;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MyClass {
    int a;
    int b;

    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    MyClass(int i) {
        this(i, i);
    }

    MyClass() {
        this(0);
    }
}
