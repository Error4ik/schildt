package main.java.com.aleksey_voronin.javacore.chapter15.references_to_constructors;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
