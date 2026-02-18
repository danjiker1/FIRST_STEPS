import Objects.BaseTest;
import Objects.CheckBoxPage;
import Objects.ElementsPage;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ElementsTest extends BaseTest {


    @Test
    @DisplayName("Тестирование TextBox")
    public void TextBoxTest(){


        ElementsPage elementsPage = new ElementsPage();
        elementsPage.open();
        elementsPage.fillFormWithRandomData();
        elementsPage.setSubmitButton();
//        String name = "Daniil";
//        String email = "Daniil@mail.ru";
//        String currentAdress = "Main st 5";
//        String permanentAdress = "Main st 10";




//        open("https://demoqa.com/text-box");

//        $("#userName").setValue(name);
//        $("[placeholder='name@example.com']").setValue(email);
//        $("#currentAddress").setValue(currentAdress);
//        $("#permanentAddress").setValue(permanentAdress);
//
//
//        $("#submit").click();

        $("#output").shouldHave(visible);

        $("#name").shouldHave(text("Name:"));

        $("#email").shouldHave(text("@"));

        // Проверяем количество выведенных строк
        $$("#output p").shouldHave(CollectionCondition.size(4));


    }

    @Test
    @DisplayName("Тестирование Чек-боксов")
    public void CheckBoxTest(){

        CheckBoxPage checkBoxPage = new CheckBoxPage();

        checkBoxPage.open();
        checkBoxPage.expandButton("Home");
        checkBoxPage.expandButton("Documents");
        checkBoxPage.expandButton("WorkSpace");
        checkBoxPage.clickCheckBox("React");

        $("#result").shouldHave(visible);

        $(".text-success").shouldHave(text("react"));
    }
}
