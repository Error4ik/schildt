package main.java.com.aleksey_voronin.javacore.chapter21.mapped_channel;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("resources/test.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE)) {

            MappedByteBuffer mBuf =
                    fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
