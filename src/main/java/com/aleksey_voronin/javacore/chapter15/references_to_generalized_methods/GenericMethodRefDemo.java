package main.java.com.aleksey_voronin.javacore.chapter15.references_to_generalized_methods;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа 4");

        count = myOp(MyArrayOps::<String>countMatching, strs, "Два");
        System.out.println("Массив strs содержит " + count + " числа два");
    }
}

