package LinkedList;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Di");
        String str3 = new String("I love Java");
        String str4 = new String("I am learning a new programming language");

        LinkedList<String> diBio = new LinkedList<>();
        diBio.add(str1);
        diBio.add(1, "new element");
        diBio.remove(1);
        diBio.add(str2);
        diBio.add(str3);
        diBio.add(str4);

        System.out.println(diBio);
    }
}
