package main.java.com.aleksey_voronin.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class CopyFile {
    private static final String FILES_PATH = "resources/";

    public static void main(String[] args) {
        int i;
        if (args.length != 2) {
            System.out.println("Использование: CopyFile Откуда Куда ?");
            return;
        }

        try (FileInputStream fin = new FileInputStream(FILES_PATH + args[0]);
             FileOutputStream fout = new FileOutputStream(FILES_PATH + args[1])) {

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
//        int i;
//        FileInputStream fin = null;
//        FileOutputStream fout = null;
//
//        if (args.length != 2) {
//            System.out.println("Использование: CopyFile Откуда Куда ?");
//            return;
//        }
//
//        try {
//            fin = new FileInputStream(FILES_PATH + args[0]);
//            fout = new FileOutputStream(FILES_PATH + args[1]);
//
//            do {
//                i = fin.read();
//                if (i != -1) {
//                    fout.write(i);
//                }
//            } while (i != -1);
//        } catch (IOException e) {
//            System.out.println("Ошибка ввода-вывода " + e);
//        } finally {
//            if (fin != null) {
//                try {
//                    fin.close();
//                } catch (IOException e) {
//                    System.out.println("Ошибка закрытия файла ввода.");
//                }
//            }
//            if (fout != null) {
//                try {
//                    fout.close();
//                } catch (IOException e) {
//                    System.out.println("Ошибка закрытия файлы вывода.");
//                }
//            }
//        }
    }
}
