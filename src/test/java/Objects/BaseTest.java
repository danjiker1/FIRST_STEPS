package Objects;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
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
}
