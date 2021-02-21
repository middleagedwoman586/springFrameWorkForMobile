package Flow;


import Pages.pages.HomePage;
import Pages.pages.RegistrationPage;
import Utils.PageStorage;
import Utils.WaitUtils;
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
        homePage= new HomePage();
        homePage.open();
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
        registrationPage=new RegistrationPage();
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
}
