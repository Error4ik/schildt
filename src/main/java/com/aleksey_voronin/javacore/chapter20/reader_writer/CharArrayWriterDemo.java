package main.java.com.aleksey_voronin.javacore.chapter20.reader_writer;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = " Эти данные должны быть выведены в массив";
        char buf[] = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");

        char c[] = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nВ поток вывода типа FileWriter()");

        try(FileWriter f2 = new FileWriter("resources/test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

        System.out.println("Установка исходного состояния");
        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }

        System.out.println(f.toString());
    }
}
