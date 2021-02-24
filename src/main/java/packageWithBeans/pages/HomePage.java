package packageWithBeans.pages;

import config.IConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("WEB")
public class HomePage extends BasePage {

    private WebDriver driver;

    @Autowired
    public HomePage(IConfig<WebDriver> config) {
        super(config);
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





}
