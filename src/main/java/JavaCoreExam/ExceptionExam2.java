package JavaCoreExam;

import java.util.Scanner;

public class ExceptionExam2 {
    public static void main(String[] args){
        int [] data = {1,2,6,23,6,7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс элемента массива");
        String input = scanner.nextLine();
        try {
            int index = Integer.parseInt(input);
            int value = getElement(data, index);
            System.out.println("Все круто");
        }
        catch (IllegalArgumentException e){
            System.out.println("Ошибка " + e.getMessage());
        }

    }
    public static int getElement(int [] array, int index){
        if(index < 0 || index >= array.length){
            throw new IllegalArgumentException(index + " Является исключением");
        }
        return index;
    }


}
