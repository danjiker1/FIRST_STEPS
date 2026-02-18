package JavaCoreExam;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
    public static void main(String[] args){


        Set<Integer> numbers = new HashSet<>();

        numbers.add(1001);
        numbers.add(1002);
        numbers.add(1003);
        numbers.add(1001);
        numbers.add(1004);


        System.out.println("Весь список: " + numbers);

        System.out.println("Проверка наличия значения 1005 - " + numbers.contains(1005));

        numbers.remove(1002);
        System.out.println(numbers);

        System.out.println("Общее количество - " + numbers.size());
    }
}
