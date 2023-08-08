package main.java.com.aleksey_voronin.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 06.08.2023.
 */
public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555", "larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Имена и номера телефонов в списке типа List");
        for (NamePhone np : npList) {
            System.out.println(np.name + " " + np.phonenum);
        }

        nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("Имена и номера телефонов в списке типа Set");
        for (NamePhone np : npSet) {
            System.out.println(np.name + " " + np.phonenum);
        }
    }
}
