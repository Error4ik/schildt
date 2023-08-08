package main.java.com.aleksey_voronin.javacore.chapter21.explicit_channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class ExplicitChanelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        try {
            filepath = Paths.get("resources/test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path error " + e);
            return;
        }

        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
            ByteBuffer buffer = ByteBuffer.allocate(128);

            do {
                count = fChan.read(buffer);
                if (count != -1) {
                    buffer.rewind();

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
