package JavaCoreExam;

public class PasswordException {

    public static class TooShortPasswordException extends Exception{
        public TooShortPasswordException(String message){
            super(message);
        }
    }

    public static class PassValidate{
        public void passLenght(String password) throws TooShortPasswordException{
            if (password.length()<8){
                throw new TooShortPasswordException("Пароль слишком короткий. Текущая длина - " + password.length());

            }
            else {
                System.out.println("Длина пароля ок");
            }
        }
    }

}
