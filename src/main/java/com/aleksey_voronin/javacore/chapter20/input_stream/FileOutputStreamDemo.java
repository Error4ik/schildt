package main.java.com.aleksey_voronin.javacore.chapter20.input_stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String path = "resources/";
        String source = "In this article we're going to look at the " +
                "most common scenarios of serialization using the " +
                "Gson library. Let's start by introducing a simple.";

        byte buf[] = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream(path + "file10.txt");
            f1 = new FileOutputStream(path + "file20.txt");
            f2 = new FileOutputStream(path + "file30.txt");

            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }

            f1.write(buf);

            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (f0 != null) f0.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла  file10.txt");
            }
            try {
                if (f1 != null) f1.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла  file20.txt");
            }
            try {
                if (f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла  file30.txt");
            }
        }
    }
}
