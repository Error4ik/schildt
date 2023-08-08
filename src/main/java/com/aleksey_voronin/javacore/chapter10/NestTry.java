package main.java.com.aleksey_voronin.javacore.chapter10;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;

            System.out.println("a = " + a);

            try {
                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива. " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль. " + e);
        }
    }
}
