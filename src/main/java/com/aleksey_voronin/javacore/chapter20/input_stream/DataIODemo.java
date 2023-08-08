package main.java.com.aleksey_voronin.javacore.chapter20.input_stream;

import java.io.*;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("resources/data.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода ");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("resources/data.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.print("Полученные значения " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода ");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
