package Objects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchPage {


    SelenideElement searchString = $("[name='q']");

    public GoogleSearchPage open() {
        Selenide.open("https://www.google.com/");
        return this;
    }

    public void search(String query) {
        searchString.setValue(query).pressEnter();
    }


}
