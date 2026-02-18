import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SmokeTest {

    @Test
    void searchHuesosiInYandex() {
        Configuration.headless = false; // для отладки
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;

        // Шаг 1: Прямой переход к результатам поиска
        open("https://yandex.ru/search/?text=цейлонская гадюка");

        // Шаг 2: Проверяем что результаты загрузились
        $(".serp-list, .main__content").shouldBe(visible);
        $("body").shouldHave(text("цейлонская гадюка"));

        sleep(5000);
    }
}