package main.java.com.aleksey_voronin.javacore.chapter21.before_jdk_1_7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.InvalidPathException;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class ExplicitChannelWrite {
    public static void main(String[] args) {
        FileOutputStream fOut = null;
        FileChannel fChan = null;
        ByteBuffer buffer;

        try {
            fOut = new FileOutputStream("resources/test.txt");
            fChan = fOut.getChannel();
            buffer = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }

            buffer.rewind();
            fChan.write(buffer);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
            System.exit(1);
        } finally {
            try {
                if (fOut != null)
                    fOut.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала");
            }
            try {
                if (fOut != null)
                    fOut.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
