package JavaCoreExam;

public class Main {
    public static void main(String[] args) {
        PasswordException.PassValidate validate = new PasswordException.PassValidate();
        try {
            validate.passLenght("123");
            System.out.println("Пароль успешно введен");
        }
        catch (PasswordException.TooShortPasswordException e){
            System.out.println("Исключение " + e.getMessage());
        }
        try {
            validate.passLenght("123456789");
            System.out.println("Пароль успешно введен");
        }
        catch (PasswordException.TooShortPasswordException e){
            System.out.println("Исключение " + e.getMessage());
        }
        try {
            validate.passLenght("12345678");
            System.out.println("Пароль успешно введен");
        }
        catch (PasswordException.TooShortPasswordException e){
            System.out.println("Исключение " + e.getMessage());
        }


    }
}
