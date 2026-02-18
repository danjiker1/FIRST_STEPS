import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FormTest {

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
    void smartWait(){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Daniil");
        $("#lastName").setValue("Egorov");
        $("#userEmail").setValue("Aaa1@mail.ru");
       $$("#genterWrapper").filterBy(text("Male")).first().click();
        sleep(5000);

    }
}
