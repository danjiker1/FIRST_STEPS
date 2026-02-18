package JavaCoreExam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("Даниил");
        names.add("Максим");
        names.add("Александр");
        names.add("Даниил");

        System.out.println("Список имен " + names);

        System.out.println("Всего " + names.size());

        names.remove(1);
        System.out.println(names);

        // Перебор элементов (for-each loop)
        System.out.print("Имя: ");
        for (String n : names) {
            System.out.print(n + " ");
        }

        System.out.println(names.contains("Анна"));



    }
}
