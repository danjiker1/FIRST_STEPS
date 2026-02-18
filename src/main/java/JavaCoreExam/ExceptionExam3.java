package JavaCoreExam;

public class ExceptionExam3 {

    static class TooYoungException extends RuntimeException {
        public TooYoungException(String message) {
            super(message);
        }


    }
    public static void checkAge(int age) throws TooYoungException{
        if (age <= 18){
            throw new TooYoungException("Возраст " + age + " слишком мал.");
        }
    }

    public static void main(String[] args){
        int age = 19;

        try {
            checkAge(age);
            System.out.println("Отлично!");
        }
        catch (TooYoungException e){
            System.out.println("Ошибка "+ e.getMessage());
        }
    }
}