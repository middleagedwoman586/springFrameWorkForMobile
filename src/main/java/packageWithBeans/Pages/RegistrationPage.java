package packageWithBeans.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;

@Component
public class RegistrationPage extends BasePage {

    public RegistrationPage()  {
        PageFactory.initElements(getWebDriver(), this);
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

    @Override
    public String getUrl() {
        return null;
    }
}
