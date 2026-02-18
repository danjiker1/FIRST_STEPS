import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class TodoTest {

    @Test
    void todoTest(){
        open("https://todomvc.com/examples/react/dist/");
        $(".new-todo").setValue("Value1").pressEnter();
        $(".new-todo").setValue("Value2").pressEnter();
        $$("label").findBy(text("Value2")).doubleClick();




        sleep(2000);
    }
}
