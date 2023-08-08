package main.java.com.aleksey_voronin.javacore.chapter15.references_to_generalized_methods;

import java.util.ArrayList;
import java.util.Collections;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class UserMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        MyClass maxValObj = Collections.max(al, UserMethodRef::compareMC);

        System.out.println("Максимальное значение равно " + maxValObj.getVal());
    }
}
