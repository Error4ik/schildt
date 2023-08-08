package main.java.com.aleksey_voronin.javacore.chapter21.file_visitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "resources";

        System.out.println("Дерево каталогов начинается с каталога " + dirname + "\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
