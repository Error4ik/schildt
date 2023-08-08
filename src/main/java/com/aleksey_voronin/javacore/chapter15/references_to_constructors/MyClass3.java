package main.java.com.aleksey_voronin.javacore.chapter15.references_to_constructors;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MyClass3 {
    String str;

    public MyClass3(String str) {
        this.str = str;
    }

    public MyClass3() {
        str = "";
    }

    public String getVal() {
        return str;
    }
}
