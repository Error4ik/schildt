package main.java.com.aleksey_voronin.javacore.chapter10;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class ChainExcDemo {

    static void demoProc() {
        NullPointerException e = new NullPointerException("Верхний уровень.");
        e.initCause(new ArithmeticException("Причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение. " + e);
            System.out.println("Первопричина. " + e.getCause());
        }
    }
}
