package packageWithBeans.Pages;

import Config.WebDriverConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;


@Component
public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "/html/body/app-root/div/div[1]/rz-header/header/div/div/rz-mobile-user-menu/button")
    private WebElement menu;
    @FindBy(xpath = "//button[text()=' Реєстрація ']")
    private WebElement registration;


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

    public HomePage open() {
        getWebDriver().get(getUrl());
        return this;
    }

}
