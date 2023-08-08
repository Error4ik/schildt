package main.java.com.aleksey_voronin.javacore.chapter20.catalogs;

import java.io.File;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class DirList {
    private static final String FILE_PATH = "resources/";

    public static void main(String[] args) {
        String dirname = FILE_PATH;
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " Является каталом");
                } else {
                    System.out.println(s[i] + " Является Файлом");
                }
            }
        } else {
            System.out.println(dirname + " не является каталогом");
        }
    }
}
