package main.java.com.aleksey_voronin.javacore.chapter13.instance_of;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 04.08.2023.
 */
public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("а является А");
        if (b instanceof B)
            System.out.println("b является B");
        if (c instanceof C)
            System.out.println("c является C");
        if (c instanceof A)
            System.out.println("c можно привести к А");
        if (a instanceof C)
            System.out.println("a можно привести к C");

        System.out.println();

        A ob;

        ob = d;
        System.out.println("ob Теперь ссылается на d");
        if (ob instanceof D)
            System.out.println("ob является D");

        System.out.println();

        ob = c;
        System.out.println("ob теперь ссылается на c");

        if (ob instanceof D)
            System.out.println("ob можно привести к типу D");
        else
            System.out.println("ob нельзя привести к типу D");

        if (ob instanceof A)
            System.out.println("ob можно привести к типу A");

        System.out.println();

        if (a instanceof Object)
            System.out.println("a можно привести к типу Object");
        if (b instanceof Object)
            System.out.println("b можно привести к типу Object");
        if (c instanceof Object)
            System.out.println("c можно привести к типу Object");
        if (d instanceof Object)
            System.out.println("d можно привести к типу Object");
    }
}
