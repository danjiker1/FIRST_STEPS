import Objects.GoogleSearchPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTest {


    @Test
    public void search() {
        GoogleSearchPage searchPage = new GoogleSearchPage();
        searchPage.open();
        searchPage.search("java");


    }



}
