import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sun.security.util.Password;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.*;
//Robot r = new Robot();
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);


//Авторизация

public class CRT extends Main {
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Введите логин']")
    private SelenideElement LoginElement;

    public CRT inputlogin() throws AWTException {
        LoginElement.sendKeys(vvod1);
        return page(CRT.class);
    }

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")
    private SelenideElement LoginElement2;

    public CRT inputlogin2() throws AWTException {
        LoginElement2.click();
        LoginElement2.sendKeys(vvod2);
        return page(CRT.class);
    }
    @FindBy(how = How.XPATH, using = "//div[@class='button__slot']")
    private SelenideElement buttonslot;

    public CRT clicsite() {
        buttonslot.click();
        return page(CRT.class);
    }

//Создание карточки клиенты

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/div[3]/div[1]/a[3]/div[1]")
    private SelenideElement in1;

    public CRT bt1() throws AWTException {
        in1.click();
        return page(CRT.class);
    }
    @FindBy(how = How.XPATH, using = "//button[@class='add-button']")
    private SelenideElement in2;

    public CRT bt2() {
        in2.click();
        return page(CRT.class);
    }

//Заполнение карточки клиенты
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div[2]/main/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/form/div[1]/div/input")
    private SelenideElement polename;

    public CRT vvodpolename() throws AWTException {
        polename.sendKeys(name1);
        return page(CRT.class);
    }

//    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div[2]/main/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/form/div[4]/div[1]/div/input")
//    private SelenideElement polename2;
//
//    public CRT vvodpolename2() throws AWTException {
//        polename.sendKeys(name1);
//        return page(CRT.class);
//    }

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div[2]/main/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/form/div[4]/div[1]/div/input")
    private SelenideElement poleinn;

    public CRT vvodpoleinn() throws AWTException {
        poleinn.sendKeys(inn1);
        return page(CRT.class);
    }
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div[2]/main/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/form/div[4]/div[9]/div/input")
    private SelenideElement poleadress;

    public CRT vvodpoleadress() throws AWTException {
        poleadress.sendKeys(adress1);
        return page(CRT.class);
    }
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div[2]/main/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/form/div[4]/div[12]/textarea")
    private SelenideElement polecomment;

    public CRT vvodpolecomment() throws AWTException {
        polecomment.sendKeys(comment);
        return page(CRT.class);
    }
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div[2]/main/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[2]/button")
    private SelenideElement savebt;

    public CRT clicksavebt() {
        savebt.click();
        return page(CRT.class);
    }


////Создание карточки карьеры
//
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
//    private SelenideElement btcreated;
//
//    public CRT clickbtcreated() {
//        btcreated.click();
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
//    private SelenideElement polename2;
//
//    public CRT vvodpolename2() throws AWTException {
//        polename2.sendKeys(name2);
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")
//    private SelenideElement poleinn2;
//
//    public CRT vvodpoleinn2() throws AWTException {
//        poleinn2.sendKeys(inn2);
//        return page(CRT.class);
//
//    }
//
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")
//    private SelenideElement bkok;
//
//    public CRT clickbkok() {
//        bkok.click();
//        return page(CRT.class);
//    }
//
//
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[2]/div[1]/input[1]")
//    private SelenideElement polekpp;
//
//    public CRT vvodpolekpp() throws AWTException {
//        polekpp.sendKeys(kpp);
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/input[1]")
//    private SelenideElement poleogrn;
//
//    public CRT vvodpoleogrn() throws AWTException {
//        poleogrn.sendKeys(ogrn);
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/input[1]")
//    private SelenideElement poleadress1;
//
//    public CRT vvodpoleadress1() throws AWTException {
//        poleadress1.sendKeys(adress2);
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/input[1]")
//    private SelenideElement poleadress2;
//
//    public CRT vvodpoleadress2() throws AWTException {
//        poleadress2.sendKeys(adress3);
//        return page(CRT.class);
//    }
//
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/div[1]/div[1]/input[1]")
//    private SelenideElement save3;
//
//    public CRT clicksave3() {
//        save3.click();
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/div[1]/div[2]/div[1]")
//    private SelenideElement save4;
//
//    public CRT clicksave4() {
//        save4.click();
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/div[1]/div[1]/input[1]")
//    private SelenideElement save5;
//
//    public CRT clicksave5() {
//        save5.click();
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/div[1]/div[2]/div[1]")
//    private SelenideElement save7;
//
//    public CRT clicksave7() {
//        save7.click();
//        return page(CRT.class);
//    }
//
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/input[1]")
//    private SelenideElement polehold88;
//
//    public CRT vvodpolepolehold88() throws AWTException {
//        polehold88.click();
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[10]/div[1]/div[1]/div[2]/div[1]")
//    private SelenideElement save8hold99;
//
//    public CRT clicksave8hold99() {
//        save8hold99.click();
//        return page(CRT.class);
//    }
//
//
//
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[11]/div[1]/div[1]/input[1]")
//    private SelenideElement polehold3;
//
//    public CRT vvodpolepolehold() throws AWTException {
//        polehold3.sendKeys(holding);
//        return page(CRT.class);
//    }
//    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]")
//    private SelenideElement save8hold;
//
//    public CRT clicksave8hold() {
//        save8hold.click();
//        return page(CRT.class);
//    }
//
//
//
//    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div[2]/main/div/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[2]/button")
//    private SelenideElement save2;
//
//    public CRT clicksave2() {
//        save2.click();
//        return page(CRT.class);
//    }
//































//
//    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'О нас - Creative')]")
//    private SelenideElement SEARCHforsite;
//
//    public CRT clicsite() {
//        SEARCHforsite.click();
//        return page(CRT.class);
//    }
//
//    @FindBy(how = How.XPATH, using = "//div[@id='rec420332771']//span[2]")
//    private SelenideElement navigation;
//
//    public CRT clicnavigation() {
//        navigation.click();
//        return page(CRT.class);
//    }
//
//    @FindBy(how = How.XPATH, using = "//a[@class='tn-atom'][contains(text(),'Контакты')]")
//    private SelenideElement contacts;
//
//    public CRT cliccontacts() {
//        contacts.click();
//        return page(CRT.class);
//    }


}






