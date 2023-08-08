package main.java.com.aleksey_voronin.javacore.chapter10;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль. " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива. " + e);
        }

        System.out.println("После блока try/catch.");
    }
}
