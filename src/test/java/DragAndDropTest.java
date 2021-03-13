import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @Test
    void DragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // нахождение элементов
        SelenideElement
                blockA = $("#column-a"),
                blockB = $("#column-b");
        //п перенос элементов
       (blockA).dragAndDropTo(blockB);
       //проверка переноса элементов
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));
    }
}

