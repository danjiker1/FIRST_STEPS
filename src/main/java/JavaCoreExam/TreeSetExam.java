package JavaCoreExam;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {

    public static void main(String[] args){

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(8);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Числа по порядку: " + numbers);

        System.out.println("Самое маленькое число - " + ((TreeSet<Integer>) numbers).first());

    }
}
