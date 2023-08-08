package main.java.com.aleksey_voronin.javacore.chapter20.reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("resources/file.txt")){
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода ");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
