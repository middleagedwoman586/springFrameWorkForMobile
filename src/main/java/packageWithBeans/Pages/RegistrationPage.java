package packageWithBeans.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class RegistrationPage extends BasePage {


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ua.com.rozetka.shop:id/sign_up_et_first_name\")")
    private MobileElement firstName;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ua.com.rozetka.shop:id/sign_up_et_last_name\")")
    private MobileElement lastName;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ua.com.rozetka.shop:id/sign_up_et_login\")")
    private MobileElement telephoneOrEmail;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ua.com.rozetka.shop:id/sign_up_et_password\")")
    private MobileElement password;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ua.com.rozetka.shop:id/sign_up_b_register\")")
    private MobileElement submit;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ua.com.rozetka.shop:id/textinput_error\")")
    private MobileElement error;

    public MobileElement getError() {
        return error;
    }

    public MobileElement getFirstName() {
        return firstName;
    }

    public MobileElement getLastName() {
        return lastName;
    }

    public MobileElement getTelephoneOrEmail() {
        return telephoneOrEmail;
    }

    public MobileElement getPassword() {
        return password;
    }

    public MobileElement getSubmit() {
        return submit;
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
