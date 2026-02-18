package JavaCoreExam;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExam {

    public static void main(String[] args){


        Set<String> links = new LinkedHashSet<>();

        links.add("A");
        links.add("B");
        links.add("C");
        links.add("D");

        System.out.println("Ссылки: " + links);

        System.out.println("Кол-во: " + links.size());

        System.out.println("Есть ли B: " + links.contains("B"));

        links.remove("B");
        links.add("B");
        System.out.println(links);
    }
}
