package main.java.com.aleksey_voronin.javacore.chapter20.input_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) {
        int c;

        Vector<String> files = new Vector<>();

        files.addElement("resources/file10.txt");
        files.addElement("resources/file20.txt");
        files.addElement("resources/file30.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (NullPointerException e) {
            System.out.println("Ошибка открытия файла.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода.");
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия потока ввода SequenceInputStream");
            }
        }
    }
}
