package packageWithBeans.steps;


import packageWithBeans.pages.HomePage;
import packageWithBeans.pages.RegistrationPage;
import utils.WaitUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("WEB")
public class WebRegistrationSteps implements IRegistrationSteps {
    @Autowired
    HomePage homePage;
    @Autowired
    RegistrationPage registrationPage;

    @Override
    public void goToMenu() {

        homePage.getMenu().click();
        WaitUtils.implicitWait(homePage.getWebDriver());

    }

    @Override
    public void goToRegistrationPage() {
        WaitUtils.explicitWait(homePage.getWebDriver(), ExpectedConditions.elementToBeClickable(homePage.getRegistration()));
        homePage.getRegistration().click();
    }

    @Override
    public void setFirstName(String value) {
        registrationPage.getFirstNameInput().sendKeys(value);
    }

    @Override
    public void setLastName(String value) {
        registrationPage.getLastNameInput().sendKeys(value);
    }

    @Override
    public void setEmailOrPhone(String value) {
        registrationPage.getEmailInput().sendKeys(value);

    }


    @Override
    public void setPasswd(String value) {
        registrationPage.getPasswordInput().sendKeys(value);
    }

    @Override
    public void clickSubmit() {
        registrationPage.getSubmitButton().click();
    }

    @Override
    public String getAnwser() {
        return registrationPage.getErrorMessage().getText();
    }
}
