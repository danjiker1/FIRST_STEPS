package Objects;

import Utils.ElementsUtils;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ElementsPage {

    private SelenideElement usernameField = $("#userName");
    private SelenideElement emailField =  $("[placeholder='name@example.com']");
    private SelenideElement currentAdresslField =  $("#currentAddress");
    private SelenideElement permanentAdressField =  $("#permanentAddress");
    private SelenideElement submitButton = $("#submit");

    public void open(){
        Selenide.open("https://demoqa.com/text-box");

    }

    public void setUsernameField(String username){

        usernameField.setValue(username);

    }

    public void setEmailField(String email){

        emailField.setValue(email);

    }
    public void setCurrentAdresslField(String currentAdressl){

        currentAdresslField.setValue(currentAdressl);

    }

    public void setPermanentAdressField(String permanentAdress){

        permanentAdressField.setValue(permanentAdress);

    }

    public void setSubmitButton(){
        submitButton.click();
    }


    public void fillFormWithRandomData() {
        setUsernameField(ElementsUtils.generateUserName());
        setEmailField(ElementsUtils.generateEmail());

        String address = ElementsUtils.generateAdress();
        setCurrentAdresslField(address);
        setPermanentAdressField(address);
    }

}
