package main.java.com.aleksey_voronin.javacore.chapter21.before_jdk_1_7;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class MappedChannelWrite {
    public static void main(String[] args) {
        RandomAccessFile fOut = null;
        FileChannel fChan = null;
        ByteBuffer buffer;

        try {
            fOut = new RandomAccessFile("resources/test.txt", "rw");
            fChan = fOut.getChannel();
            buffer = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
        }catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fChan != null) {
                    fChan.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала");
            }
            try {
                if (fOut != null) {
                    fOut.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
