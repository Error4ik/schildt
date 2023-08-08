package main.java.com.aleksey_voronin.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "resources";

        try (DirectoryStream<Path> drstrm = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Каталог " + dirname);

            for (Path entry : drstrm) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory()) {
                    System.out.print("<DIR> ");
                } else {
                    System.out.print("      ");
                }

                System.out.println(entry.getName(1));
            }

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " не является каталогом ");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода  " + e);
        }
    }
}
