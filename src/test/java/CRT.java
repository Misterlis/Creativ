import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sun.security.util.Password;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;



public class CRT extends Main {
    @FindBy(how = How.XPATH, using = "//*[@id='comp-iqtvussa0label']")
    private SelenideElement buttonHOME;

    @FindBy(how = How.XPATH, using = "//*[@id='comp-iqtvussa1label']")
    private SelenideElement buttonHARDSKILLS;

    @FindBy(how = How.XPATH, using = "//*[@id='comp-iqtvussa2label']")
    private SelenideElement buttonEXPIRIENS;

    @FindBy(how = How.XPATH, using = "//*[@id='comp-iqtvussa4label']")
    private SelenideElement buttonCONTACTS;

    @FindBy(how = How.XPATH, using = "//*[@id='comp-iqtvussa5label']")
    private SelenideElement buttonBIOGRAPHY;


    public CRT clicHOME() {
        buttonHOME.click();
        return page(CRT.class);
    }
    public CRT clicSKILL() {
        buttonHARDSKILLS.click();
        return page(CRT.class);
    }
    public CRT clicEXPERIENS() {
        buttonEXPIRIENS.click();
        return page(CRT.class);
    }
    public CRT clicCONATCT() {
        buttonCONTACTS.click();
        return page(CRT.class);
    }
    public CRT clicBIOGRAPHY() {
        buttonBIOGRAPHY.click();
        return page(CRT.class);
        }



}






