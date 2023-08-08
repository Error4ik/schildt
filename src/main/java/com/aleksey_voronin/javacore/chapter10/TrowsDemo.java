package main.java.com.aleksey_voronin.javacore.chapter10;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class TrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("Демонстрация.");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение. " + e);;
        }
    }
}
