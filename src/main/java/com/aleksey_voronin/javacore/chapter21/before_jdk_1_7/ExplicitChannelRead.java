package main.java.com.aleksey_voronin.javacore.chapter21.before_jdk_1_7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class ExplicitChannelRead {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileChannel fileChannel = null;
        ByteBuffer buffer;
        int count;

        try {
            fileInputStream = new FileInputStream("resources/test.txt");
            fileChannel = fileInputStream.getChannel();
            buffer = ByteBuffer.allocate(128);
            do {
                count = fileChannel.read(buffer);
                if (count != -1) {
                    buffer.rewind();

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            } while (count != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала");
            }
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
