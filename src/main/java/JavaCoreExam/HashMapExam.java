package JavaCoreExam;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

    public static void main(String[] args){

        Map<String,Integer> resultGame = new HashMap<>();

        resultGame.put("Alexey", 150);
        resultGame.put("Maria", 220);
        resultGame.put("Ivan", 150);
        resultGame.put("Alexey", 180);

        System.out.println(resultGame);

        int resultMaria = resultGame.get("Maria");
        System.out.println("Результат Марии - " + resultMaria);

        int resultIvan = resultGame.get("Ivan");
        System.out.println(resultIvan + 50);
    }
}
