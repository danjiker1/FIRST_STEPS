package Objects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxPage {


    public void open(){
        Selenide.open("https://demoqa.com/checkbox");
    }
    private SelenideElement getExpandButton(String dir){
        return $(byText(dir))
                .closest(".rct-text")
                .$(".rct-collapse-btn");
    }

    private SelenideElement getCheckBox(String dir){
        return  $(byText(dir)).closest(".rct-text").$(".rct-checkbox");
    }

    public void expandButton(String dir){
        getExpandButton(dir).click();
    }

    public void clickCheckBox(String dir){
        getCheckBox(dir).click();
    }


}
