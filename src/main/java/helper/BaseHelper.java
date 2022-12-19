package helper;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

public class BaseHelper {
    @BeforeEach
    public void setUpDriver() {
        Configuration.browserSize = "1920x1080";
    }
}
