package JavaCoreExam;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

    public static void main(String[] args){

        List<String> messages = new LinkedList<>();

        ((LinkedList<String>) messages).addLast("Привет");
        ((LinkedList<String>) messages).addLast("Как дела?");
        ((LinkedList<String>) messages).addLast("Пока");

        System.out.println("Текущие сообщения " + messages);

        String removed = ((LinkedList<String>) messages).removeFirst();
        System.out.println("Удалено сообщение " + removed);
        System.out.println("Оставшиеся сообщения - " + messages);

        System.out.println("Первое сообщение " + ((LinkedList<String>) messages).getFirst());
        System.out.println("Последнее сообщение " + ((LinkedList<String>) messages).getLast());
    }
}
