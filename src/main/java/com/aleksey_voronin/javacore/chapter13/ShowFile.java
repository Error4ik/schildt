package main.java.com.aleksey_voronin.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class ShowFile {

    private static final String FILES_PATH = "resources/";

    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Использование: ShowFile file.txt");
            return;
        }

        try (FileInputStream fin = new FileInputStream(FILES_PATH + args[0])) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода.");
        }

//        int i;
//        FileInputStream fin = null;
//        if (args.length != 1) {
//            System.out.println("Использование: ShowFile file.txt");
//            return;
//        }
//        try {
//            fin = new FileInputStream(FILE_PATH + args[0]);
//            do {
//                i = fin.read();
//                if (i != -1) {
//                    System.out.println((char) i);
//                }
//            } while (i != -1);
//        } catch (IOException e) {
//            System.out.println("Ошибка ввода-вывода. " + e);
//        } finally {
//            try {
//                if (fin != null) {
//                    fin.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Ошибка закрытия файла.");
//            }
//        }
    }
}
