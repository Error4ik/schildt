package main.java.com.aleksey_voronin.javacore.chapter10;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class ThrowDemo {
    static void demoProc() {
        try {
            throw new NullPointerException("Демонстрация.");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoProc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват. " + e);
        }
    }
}
