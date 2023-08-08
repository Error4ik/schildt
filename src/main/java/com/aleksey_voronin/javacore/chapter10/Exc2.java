package main.java.com.aleksey_voronin.javacore.chapter10;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class Exc2 {

    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
        System.out.println("После оператора catch.");
    }
}
