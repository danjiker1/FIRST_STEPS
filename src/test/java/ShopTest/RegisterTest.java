package ShopTest;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class RegisterTest {


    @Test
    public void userRegisterTest(){

        String firstName = "Daniil";
        String lastName = "Egorov";
        String email = "Daniil_" + System.currentTimeMillis() + "@test.com";
        String password = "password";

        RegisterPage registration= new RegisterPage();
        registration.openRegister();
        registration.Register(firstName, lastName, email, password);

        $(".result").shouldHave(Condition.text("Your registration completed"));
    }
}
