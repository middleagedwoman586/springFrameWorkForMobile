package packageWithBeans.Flow;


import Utils.WaitUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import packageWithBeans.Pages.HomePage;
import packageWithBeans.Pages.RegistrationPage;

@Component
public class AppiumRegistrationSteps implements IRegistrationSteps {

    HomePage homePage;

    RegistrationPage registrationPage;

    @Override
    public void goToMenu() {
        homePage=new HomePage();
        WaitUtils.explicitWait(homePage.getWebDriver(), ExpectedConditions.visibilityOf(homePage.getMore()));
        homePage.getMore().click();

    }

    @Override
    public void goToRegistrationPage() {
        WaitUtils.explicitWait(homePage.getWebDriver(), ExpectedConditions.elementToBeClickable(homePage.getRegistr()));
        homePage.getRegistr().click();
    }

    @Override
    public void setFirstName(String value) {
        registrationPage = new RegistrationPage();
        WaitUtils.explicitWait(registrationPage.getWebDriver(), ExpectedConditions.elementToBeClickable(registrationPage.getFirstName()));
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

    @Override
    public String getAnwser() {
        return "Appium";
    }
}
