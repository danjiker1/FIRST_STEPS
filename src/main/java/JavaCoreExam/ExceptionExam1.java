package JavaCoreExam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число делимое ");
        int firstNum = scanner.nextInt();
        System.out.println("Введите число делитель ");
        int secondNum = scanner.nextInt();
        int result;

        try {
            result = divide(firstNum, secondNum);
            System.out.println("Результат: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Исключение - деление на ноль");

        }
        catch (InputMismatchException e){
            System.out.println("Исключение - введите число");
        }
        finally {
            System.out.println("Логируется действие");
        }
    }

    public static int divide(int a, int b){
    return a/b;
    }
}
