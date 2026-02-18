import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitTest {

    @BeforeAll
    public static void setup() {
        // Автоматически скачивает правильную версию драйвера
        WebDriverManager.chromedriver().setup();

        // Настройки Selenide
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 30000;

        // Отключить ожидание загрузки через JavaScript (иногда помогает)
        Configuration.pageLoadStrategy = "eager";

        // Отключить проверки WebDriver (только для тестирования)
        // Configuration.headless = false; // если нужно видеть браузер
    }


    @Test
    void shouldFindSelenideGit(){
        //Открыть github.com
        open("https://demoqa.com/books");

        $("#searchBox").setValue("Git");
        //Перейти на линк от первого результата поиска
        $("a").click();

        // Проверить, что в заголовке отображается Selenide
       // $("#card mt-4 top-card").shouldHave(text("Elements"));

        sleep(5000);
        //ARRANGE-подготовить
        //ACT-действовать
        //ASSERT-проверять
    }
}
