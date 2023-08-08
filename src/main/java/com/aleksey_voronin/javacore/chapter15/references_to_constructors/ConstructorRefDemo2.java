package main.java.com.aleksey_voronin.javacore.chapter15.references_to_constructors;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc2<Integer> myClassCons = MyClass2<Integer>::new;

        MyClass2<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
