import Objects.RadioButtonPage;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RadioButtonTest {

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
    @DisplayName("Тестирование Радио-баттон - yes")
    public void RadioButtonYesTest(){

        RadioButtonPage radioButtonPage = new RadioButtonPage();

        radioButtonPage.open()
                .clickRadioYes()
                .resultYes();
    }
    @Test
    @DisplayName("Тестирование Радио-баттон - impressive")
    public void RadioButtonImpressiveTest(){

        RadioButtonPage radioButtonPage = new RadioButtonPage();

        radioButtonPage.open()
                .clickRadioImpressive()
                .resultImpressive();
    }
    @Test
    @DisplayName("Тестирование Радио-баттон - No")
    public void RadioButtonNoTest(){

        RadioButtonPage radioButtonPage = new RadioButtonPage();

        radioButtonPage.open()
                .clickRadioNo()
                .notResultNo()
                .selectNo();
    }


}
