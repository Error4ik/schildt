package main.java.com.aleksey_voronin.javacore.chapter21.mapped_channel;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class MappedChanelRead {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(
                Paths.get("resources/test.txt"))) {

            long fSize = fChan.size();

            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }

            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
