package main.java.com.aleksey_voronin.javacore.chapter15.references_to_instance_methods;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
