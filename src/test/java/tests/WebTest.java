package tests;

import com.codeborne.selenide.Configuration;
import config.WebConfigHelper;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class WebTest {

    @Test
    @DisplayName("Web Test")
    @Owner("EpicFate")
    void SearchTest() {
        String searchURl = WebConfigHelper.getSearchUrl();
        String searchItem = WebConfigHelper.getSearchItem();
        String searchResult = WebConfigHelper.getSearchResult();
        Configuration.remote = WebConfigHelper.getWebdriverRemote();
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.browser = WebConfigHelper.getBrowserName();
        Configuration.browserVersion = WebConfigHelper.getBrowserVersion();
        Configuration.startMaximized = true;

        open(searchURl);
        $(byName("q")).setValue(searchItem).pressEnter();
        $("html").shouldHave(text(searchResult));
    }
}
