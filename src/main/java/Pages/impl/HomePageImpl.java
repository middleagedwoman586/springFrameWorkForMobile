package Pages.impl;

import Pages.pages.HomePage;
import Utils.PageStorage;
import Utils.WaitUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePageImpl {
    @Autowired
    HomePage homePage;
    @Autowired
    PageStorage pageStorage;

    public void open(){
        homePage.open();
    }
    public void clickMenu() {
        //pageStorage.getPage(homePage.getClass()).getMenu().click();
        //homePage= new HomePage();
        homePage.getMenu().click();
    }
//    public void clickMore(){
//        homePage= new HomePage();
//        WaitUtils.explicitWait(homePage.getWebDriver(), ExpectedConditions.visibilityOf(homePage.getMore()));
//        homePage.getMore().click();
//    }
//    public void clickRegMob(){
//        homePage.getRegistr().click();
//    }

    public void clickRegistration() {
        WaitUtils.implicitWait(homePage.getWebDriver());
        homePage.getRegistration().click();
    }
}
