package tests;

import com.codeborne.selenide.Configuration;
import config.WebConfigHelper;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class WebTest {
    @BeforeAll
    static void setup() {
        Configuration.remote = WebConfigHelper.getWebdriverRemote();
        Configuration.startMaximized = true;
    }

    @Test
    @DisplayName("Web Test")
    @Owner("EpicFate")
    void SearchTest() {
        String searchURl = WebConfigHelper.getSearchUrl();
        String searchItem = WebConfigHelper.getSearchItem();
        String searchResult = WebConfigHelper.getSearchResult();

        open(searchURl);
        $(byName("q")).setValue(searchItem).pressEnter();
        $("html").shouldHave(text(searchResult));
    }
}
