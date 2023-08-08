package main.java.com.aleksey_voronin.javacore.chapter20.serialization;

import java.io.*;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("resources/serial"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1 " + object1);

            outputStream.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Исключение при сериализации " + e);
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("resources/serial"))) {
            MyClass object2 = (MyClass) inputStream.readObject();
            System.out.println("object2 " + object2);

        } catch (Exception e) {
            System.out.println("Исключение при сериализации " + e);
        }
    }
}
