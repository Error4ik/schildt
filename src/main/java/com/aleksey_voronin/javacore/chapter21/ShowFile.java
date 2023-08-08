package main.java.com.aleksey_voronin.javacore.chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Применение: ShowFile имя файла");
            return;
        }

        try (InputStream fin = Files.newInputStream(Paths.get(args[0]))) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
