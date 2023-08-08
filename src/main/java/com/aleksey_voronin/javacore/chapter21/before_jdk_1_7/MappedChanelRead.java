package main.java.com.aleksey_voronin.javacore.chapter21.before_jdk_1_7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class MappedChanelRead {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileChannel fileChannel = null;
        MappedByteBuffer buffer;

        try {
            fileInputStream = new FileInputStream("resources/test.txt");

            fileChannel = fileInputStream.getChannel();

            long fSize = fileChannel.size();

            buffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) buffer.get());
            }

            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fileChannel != null)
                    fileChannel.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала");
            }
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
