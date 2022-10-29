import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.AuthenticationType.BASIC;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.Selectors;

import java.awt.*;


public class Main {
    //авторизация
    String vvod1 = "administrator@test.ru";
    String vvod2 = "test";
    //Заполнение карточки клиент
    String name1 = "ООО Автотест Клиент";
    String inn1 = "503115929542";
    String adress1 = "Кремль";
    String comment = "Тестим Автотестим";
    //Для карьера
    String name2 = "ООО Автотест Карьер";
    String kpp = "421301001";
    String inn2 = "6632017440";
    String ogrn = "1104213000264";
    String adress2 = "Кремль";
    String adress3 = "Под лавочкой";
    String holding = "Холдинг Тест 1";


    @BeforeEach
    public void beforeAll() {
    }

    @AfterEach
    public void afterAll() {
    }

    @Test
    public void TestCreateСlient1() throws AWTException, InterruptedException {

        Selenide.open("http://alfadon-front.dev.amiga.agency/", BASIC, "admin", "amigadevelop");
        Selenide.open("http://alfadon-front.dev.amiga.agency/", CRT.class)
                .inputlogin()
                .inputlogin2()
                .clicsite()
                .bt1()
                .bt2()
                .vvodpolename()
            //    .vvodpolename2()
                .vvodpoleinn()
                .vvodpoleadress()
                .vvodpolecomment()
                .clicksavebt();
        $(byText("ООО Автотест Клиент")).shouldBe(visible);
    }
//    @Test
//    public void TestCreateCareer() throws AWTException, InterruptedException {
//
//        Selenide.open("http://alfadon-front.dev.amiga.agency/", BASIC, "admin", "amigadevelop");
//        Selenide.open("http://alfadon-front.dev.amiga.agency/table-quarry-page", CRT.class)
//                //.clickbtcareer()
//                .clickbtcreated()
//                .vvodpolename2()
//                .vvodpoleinn2()
//                .clickbkok()
//                .vvodpolekpp()
//                .vvodpoleogrn()
//
//                .vvodpoleadress1()
//                .vvodpoleadress2()
//                .clicksave3()
//                .clicksave4()
//
//                .clicksave5()
//                .clicksave7()
//                .vvodpolepolehold88()
//                .clicksave8hold99()
//                .vvodpolepolehold()
//                .clicksave8hold()
//                .clicksave2();
//        $(byText("ООО Автотест Карьер")).shouldBe(visible);
//
//        sleep(9000);
//    }


//            $(byText("Нужны разработчики? Свяжитесь с нами.")).shouldBe(visible);
//            $(byText("Москва, Пресненская набережная, 12")).shouldBe(visible);
//            $(byText("Тюмень, ул. Малыгина 84 к1, 7 этаж")).shouldBe(visible);
//            $(byText("Поможем в подборе и поиске разработчиков")).scrollTo().shouldBe(visible);
//            $(byText("Заполните бриф или оставьте заявку, либо звоните, мы пообщаемся и сами все за вас заполним.")).shouldBe(visible);

    }


