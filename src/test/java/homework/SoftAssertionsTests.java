package homework;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertionsTests {

    @Test
    void checkCodeAboutJunitTest() {
        // -   Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".wiki-rightbar").$$("ul li").last().$("button").click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(".wiki-pages-box").$$(".wiki-more-pages").last().$("a").click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}