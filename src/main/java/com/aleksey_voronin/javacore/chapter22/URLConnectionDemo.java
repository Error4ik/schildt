package main.java.com.aleksey_voronin.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class URLConnectionDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d == 0) {
            System.out.println("Сведения о дате отсутствуют.");
        } else {
            System.out.println("Двтв " + new Date(d));
        }

        System.out.println("Тип содержимого " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("Сведения о сроке действия отсутсвуют");
        } else {
            System.out.println("Срок действия истекает " + new Date(d));
        }

        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("Сведения о дате последней модификации отсутсвуют");
        } else {
            System.out.println("Дата последней модификации " + new Date(d));
        }

        long len = hpCon.getContentLengthLong();
        if (len == -1) {
            System.out.println("Длина содержимого не доступна");
        } else {
            System.out.println("Длиа содержимого " + len);
        }

        if (len != 0) {
            System.out.println("==== Содержимое ====");
            InputStream inputStream = hpCon.getInputStream();
            while (((c = inputStream.read()) != -1)) {
                System.out.print((char) c);
            }
            inputStream.close();
        } else {
            System.out.println("Содержимое недоступно");
        }
    }
}
