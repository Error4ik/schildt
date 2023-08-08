package main.java.com.aleksey_voronin.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        System.out.println("Метод запроса " + hpCon.getRequestMethod());
        System.out.println("Код ответа " + hpCon.getResponseCode());
        System.out.println("Ответное сообщение " + hpCon.getResponseMessage());


        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nДалее следует заголовок:");
        for (String s : hdrField) {
            System.out.println("Ключ: " + s + " Значение: " + hdrMap.get(s));
        }
    }
}
