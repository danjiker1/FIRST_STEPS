import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTest {
    @Test
    void enterMail(){
        open("https://demoqa.com/text-box");
        $("#userEmail").setValue("Daniil@Mail.ru");

    }
    @Test
    void enterName(){
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Daniil");

    }
    @Test
    void enterSubmit(){
        open("https://demoqa.com/text-box");
        $("#submit").click();

    }


}
