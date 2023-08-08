package main.java.com.aleksey_voronin.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 06.08.2023.
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555", "larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));

        System.out.println("Исходные элементы из списка myList " + myList);
        myList.stream()
                .forEach(a -> System.out.println(a.name + " " + a.phonenum + " " + a.email));
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));
        System.out.println("Список имен и номеров телефонов ");
        nameAndPhone.forEach(a -> System.out.println(a.name + " " + a.phonenum));
    }
}
