import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.Selectors;

public class Main {
    String login1 = "Прохожу курс в Creativ :) ";
    String login = "roMarkov";
    String password = "123qaz!@#QAZ";

    @BeforeEach
    public void beforeAll() {
    }
    @AfterEach
    public void afterAll() {
    }
    @Test
    public void Test1() {

        Selenide.open("https://www.markovroman.com/", CRT.class)
                .clicHOME();

        $(byText("MARKOV")).shouldBe(visible);
    }

    @Test
    public void Test2() {

        Selenide.open("https://www.markovroman.com/", CRT.class)
                .clicSKILL();

        $(byText("HARD SKILLS")).shouldBe(visible);
    }
    @Test
    public void Test3() {

        Selenide.open("https://www.markovroman.com/", CRT.class)
                .clicEXPERIENS();

        $(byText("EXPERIENCE")).shouldBe(visible);
    }
    @Test
    public void Test4() {

        Selenide.open("https://www.markovroman.com/", CRT.class)
                .clicCONATCT();
        $x("//*[@id='textarea_comp-kx6o565w']").sendKeys(login1);

        $(byText("CONTACTS")).shouldBe(visible);
    }
    @Test
    public void Test5() {

        Selenide.open("https://www.markovroman.com/", CRT.class)
                .clicBIOGRAPHY();

        $(byText("BIOGRAPHYY")).shouldBe(visible);


    }


}
