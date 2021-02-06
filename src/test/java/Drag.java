import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Drag {
    @Test
    void DragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement
                blockA = $x("//div[@id = 'column-a']"),
                bloackB = $x("//div[@id = 'column-b']");


//        $(blockA).dragAndDropTo(bloackB);

        actions().clickAndHold(blockA).moveToElement(bloackB).perform();
    }
}

