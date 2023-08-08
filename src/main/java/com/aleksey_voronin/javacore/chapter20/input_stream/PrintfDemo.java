package main.java.com.aleksey_voronin.javacore.chapter20.input_stream;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Ниже приведены некоторые чисовые значения в рахных форматах.\n");

        System.out.print("Разные целочиследнный форматы ");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

        System.out.println();
        System.out.printf("Форматы чисел с плавающей точкой по умолчанию %f\n", 1234567.123);
        System.out.printf("Форматы чисел с плавающей точкой разделяемых щапятыми %,f\n", 1234567.123);
        System.out.printf("Форматы отрицательных чисел с плавающей точкой по умолчанию %f\n", -1234567.123);
        System.out.printf("Другой форматы отрицательных чисел с плавающей точкой по умолчанию %,(f\n", -1234567.123);

        System.out.println();

        System.out.printf("Выражение положительных и отрицательных числовых значений \n");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);
    }
}
