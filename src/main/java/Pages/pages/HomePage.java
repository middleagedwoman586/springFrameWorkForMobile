package Pages.pages;

import Utils.WaitUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
public class HomePage extends BasePage {

    @FindBy(xpath = "/html/body/app-root/div/div[1]/rz-header/header/div/div/rz-mobile-user-menu/button")
    private WebElement menu;
    @FindBy(xpath = "//button[text()=' Реєстрація ']")
    private WebElement registration;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ua.com.rozetka.shop:id/graph_more\")")
    private MobileElement more;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ua.com.rozetka.shop:id/item_menu_auth_tv_sign_up\")")
    private MobileElement registr;


    public MobileElement getMore() {
        return more;
    }

    public MobileElement getRegistr() {
        return registr;
    }

    public WebElement getMenu() {
        return menu;
    }

    public WebElement getRegistration() {
        return registration;
    }

    @Override
    public String getUrl() {
        return "https://rozetka.com.ua/ua/";
    }


}
