package main.java.com.aleksey_voronin.javacore.chapter20.filename_filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 05.08.2023.
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "resources/";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");
        String s[] = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
