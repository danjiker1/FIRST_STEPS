import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class WaitsTest {
    @Test
    void smartWait(){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Daniil");
        $("#lastName").setValue("Egorov");
        $("#genterWrapper").selectRadio("#gender-radio-1");
        sleep(5000);

    }

}
