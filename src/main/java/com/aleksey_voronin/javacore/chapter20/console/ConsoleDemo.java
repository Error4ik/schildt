package main.java.com.aleksey_voronin.javacore.chapter20.console;

import java.io.Console;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        if (con == null) return;

        str = con.readLine("Введите строку: ");
        con.printf("Введеная вами строка: %s\n", str);
    }
}
