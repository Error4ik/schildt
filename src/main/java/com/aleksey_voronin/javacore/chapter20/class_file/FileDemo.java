package main.java.com.aleksey_voronin.javacore.chapter20.class_file;

import java.io.File;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class FileDemo {

    private static final String FILE_PATH = "resources/";
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File(FILE_PATH + "COPYRIGHT");
        p("Имя файла " + f1.getName());
        p("Путь " + f1.getPath());
        p("Абсолютный путь " + f1.getAbsolutePath());
        p("Родительский каталог " + f1.getParent());
        p(f1.exists() ? "существует" : "не существует");
        p(f1.canWrite() ? "доступен для записи" : "не доступен для записи");
        p(f1.canRead() ? "доступен для чтения" : "не доступен для чтения");
        p(f1.isDirectory() ? "является каталогом" : "не является каталогом");
        p(f1.isFile() ? "является обычным файлом" : "может быть именованным каналом");
        p(f1.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        p("Последние изменения в файле: " + f1.lastModified());
        p("Размер: " + f1.length() + " байт");
    }
}
