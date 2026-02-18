import com.codeborne.selenide.commands.SelectRadio;
import org.example.SummaEx;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ComebackTest {


    SummaEx calc = new SummaEx();
   @BeforeAll
   static void start() {
       System.out.println("Начинаем тест");
    }

    @Test
    void summa(){


        Assertions.assertTrue(5>2);
        System.out.println("5 больше 2!");
    }

    @Test
    void add(){
       Assertions.assertEquals(5 , SummaEx.calc(2,3));
       System.out.println("Числа равны");

    }

    @Test
    void result(){
       int result = 5+5;
       Assertions.assertEquals(10, result);
       System.out.println("Тест пройден");
    }

    @Test
    void openGoogle(){
       open("https://www.google.com/webhp?hl=ru&ictx=2&sa=X&ved=0ahUKEwiNr4GOzr-RAxUv1gIHHeS4EJcQPQgJ");
       sleep(500);
    }

    @Test
    void SearchVisible(){
       open("https://demoqa.com/");
        $(byText("Elements")).shouldBe(visible);

    }

    @Test
    void SearchExist(){
        open("https://demoqa.com/");
        $(byText("Forms")).shouldBe(exist);

    }

    @Test
    void SearchText(){
        open("https://demoqa.com/text-box");
        $("#userEmail").shouldBe(visible);

    }

    @Test
    void enterMail(){
        open("https://demoqa.com/text-box");
        $("#userEmail").setValue("AAAA");
    sleep(5000);
    }

    @AfterAll
    static void end(){
       System.out.println("Заканчиваем тест");
    }
}
