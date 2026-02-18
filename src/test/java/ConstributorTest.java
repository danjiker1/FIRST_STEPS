import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ConstributorTest {

    @Test
    void solntsevShouldBeFirstConstributor(){
        Configuration.browserSize="800x400";
      open("https://github.com/selenide/selenide");  //Открыть репозиторий
        $(".Layout-sidebar").$$("h2").filterBy(text("Contributors"))
                .first().sibling(0).$$("li").first().hover();//Подвести мышку к оверлею с создателями
       $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev")); //- Если несколько варинтов невидимы и класс называется одинаково
        //Проверить что показывается Андрей Солнцев
        sleep(5000);
    }
}
