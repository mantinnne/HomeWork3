import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Snippets {
    @Test
    void softAssertionsTest() {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $$("#wiki-pages-box li a").find(text("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}

