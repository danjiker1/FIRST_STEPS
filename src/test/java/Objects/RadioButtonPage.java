package Objects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RadioButtonPage {

    private SelenideElement radioYes = $("label[for='yesRadio']");
    private SelenideElement radioImpressive = $("label[for='impressiveRadio']");
    private SelenideElement radioNo = $("label[for='noRadio']");
    private SelenideElement result = $(".text-success");


    public RadioButtonPage open(){
        Selenide.open("https://demoqa.com/radio-button");
        return this;
    }

    public RadioButtonPage clickRadioYes(){
        radioYes.click();
        return this;
    }

    public RadioButtonPage clickRadioNo(){
        radioNo.click();
        return this;
    }

    public RadioButtonPage clickRadioImpressive(){
        radioImpressive.click();
        return this;
    }

    public RadioButtonPage resultYes(){
        result.shouldHave(text("Yes"));
        return this;
    }

    public RadioButtonPage resultImpressive(){
        result.shouldHave(text("Impressive"));
        return this;
    }

    public RadioButtonPage notResultNo(){
        result.shouldNot(visible);
        return this;

    }

    public RadioButtonPage selectNo() {
        try {
            radioNo.click();
        } catch (Exception e) {
            System.out.println("Элемент No заблокирован, как и ожидалось");
        }
        return this;
    }


}
