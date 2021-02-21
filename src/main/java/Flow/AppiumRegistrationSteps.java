package Flow;

import Pages.impl.HomePageImpl;
import Pages.impl.RegistrationPageImpl;
import Pages.pages.HomePage;
import Pages.pages.RegistrationPage;
import Utils.WaitUtils;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("APPIUM")
public class AppiumRegistrationSteps implements IRegistrationSteps {
    @Autowired
    HomePage homePage;
    @Autowired
    RegistrationPage registrationPage;

    @Override
    public void goToMenu() {
        homePage= new HomePage();
        WaitUtils.explicitWait(homePage.getWebDriver(), ExpectedConditions.visibilityOf(homePage.getMore()));
        homePage.getMore().click();

    }

    @Override
    public void goToRegistrationPage() {
        homePage.getRegistr().click();
    }

    @Override
    public void setFirstName(String value) {
        registrationPage= new RegistrationPage();
        registrationPage.getFirstName().sendKeys(value);
    }

    @Override
    public void setLastName(String value) {
        registrationPage.getLastName().sendKeys(value);
    }

    @Override
    public void setEmailOrPhone(String value) {
        registrationPage.getTelephoneOrEmail().sendKeys(value);
    }


    @Override
    public void setPasswd(String value) {
        registrationPage.getPassword().sendKeys(value);
    }

    @Override
    public void clickSubmit() {
        registrationPage.getSubmit().click();
    }
}
