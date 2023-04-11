package homework_2;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EnterprisePageTests {

    @Test
    void checkTitleEnterpriseTest() {

        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(byText("Build like the best")).shouldBe(visible);

    }
}
