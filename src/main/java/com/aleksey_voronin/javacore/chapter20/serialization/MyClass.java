package main.java.com.aleksey_voronin.javacore.chapter20.serialization;

import java.io.Serializable;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}
