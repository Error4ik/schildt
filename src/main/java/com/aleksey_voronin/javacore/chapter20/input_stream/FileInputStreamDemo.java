package main.java.com.aleksey_voronin.javacore.chapter20.input_stream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream("resources/file.txt")) {
            System.out.println("Общее количество доступных байтов " + (size = f.available()));
            int n = size / 40;
            System.out.println("Первые " + n + " байтов, прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nВсе еще доступно " + f.available());
            System.out.println("Чтение следующих " + n + " байтов по очереди методом read(b[])");

            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Нельзя прочитать " + n + " байтов");
            }

            System.out.println(new String(b, 0, n));
            System.out.println("\nВсе еще доступно " + f.available());

            System.out.println("Пропустить половину оставшихся байтов методом skip()");
            f.skip(size / 2);
            System.out.println("\nВсе еще доступно " + f.available());

            System.out.println("Чтение " + n / 2 + " байтов размещенных в конце массива");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("Нельзя прочитать " + n / 2 + " байтов");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсе еще доступно " + f.available());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
