package ui;

import helper.BaseHelper;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

@Tag("ui")
@DisplayName("UI tests")
public class UITests extends BaseHelper {

    @Test
    @DisplayName("Find iPhones")
    public void citylinkTest() {
        Allure.step("Follow the link: https://www.citilink.ru/", () -> {
            open("https://www.citilink.ru/");
        });

        Allure.step("Enter in the search \"iphone\" and click the button \"find\"", () -> {
            $x("//div[@class='MainHeader__search']//input[@placeholder='Поиск по товарам']").sendKeys("iphone");
            $x("//div[@class='MainHeader__search']//button[contains(@class, 'InputSearch__button ')]").click();
        });
    }
}
