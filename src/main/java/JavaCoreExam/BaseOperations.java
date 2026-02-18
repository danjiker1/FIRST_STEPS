package JavaCoreExam;

public class BaseOperations {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBazz");
            } else if (i % 5 == 0) {
                System.out.println("Bazz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
