package main.java.com.aleksey_voronin.javacore.chapter20.reader_writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "In this article we're going to look at the " +
                "most common scenarios of serialization using the " +
                "Gson library. Let's start by introducing a simple.";

        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f0 = new FileWriter("resources/file10.txt");
             FileWriter f1 = new FileWriter("resources/file20.txt");
             FileWriter f2 = new FileWriter("resources/file30.txt");) {

            for (int i = 0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }

            f1.write(buffer);

            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
