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
public class RegistrationPage extends BasePage {
    @Autowired
    public RegistrationPage(IConfig<WebDriver> config) {
        super(config);
    }

    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement firstNameInput;
    @FindBy(xpath = "//input[@formcontrolname='surname']")
    private WebElement lastNameInput;
    @FindBy(xpath = "//input[@formcontrolname='phone']")
    private WebElement phoneInput;
    @FindBy(xpath = "//input[@formcontrolname='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElement passwordInput;
    @FindBy(css = "button[type=submit]")
    private WebElement submitButton;
    @FindBy(xpath = "//p[@class='form__caption' and contains(text(),'Пароль')]")
    private WebElement errorMessage;

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getPhoneInput() {
        return phoneInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
    public WebElement getErrorMessage(){
        return errorMessage;
    }

}