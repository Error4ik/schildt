package main.java.com.aleksey_voronin.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/Articles");

        System.out.println("Протокол " + hp.getProtocol());
        System.out.println("Порт " + hp.getPort());
        System.out.println("Хост " + hp.getHost());
        System.out.println("Файл " + hp.getFile());
        System.out.println("Полная форма " + hp.toExternalForm());
    }
}
