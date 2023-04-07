package homework;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DifferenceOfElementsTests {

    ClassLoader cl = DifferenceOfElementsTests.class.getClassLoader();
    @Test
    void selenideElementsTest() {
        URL fileUrl = cl.getResource("index.html");
        open(fileUrl);
        SelenideElement str = $("h1 div");
        SelenideElement str1 = $("h1").$("div");
        System.out.println("$(\"h1 div\") " + str);
        System.out.println("$(\"h1\").$(\"div\")" + str1);
    }
}

// Разница в алгоритме поиска:
// $("h1 div") находит пару эл-тов h1 div
// $("h1").$("div") находит сначала первый h1 затем в нем ищется div, если в первом h1 не будет div, то следующий h1 искать не будет
