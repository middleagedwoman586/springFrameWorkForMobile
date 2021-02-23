package packageWithBeans.Flow;


import Utils.WaitUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import packageWithBeans.Pages.HomePage;
import packageWithBeans.Pages.HomePageAppium;
import packageWithBeans.Pages.RegistrationPage;
import packageWithBeans.Pages.RegistrationPageAppium;

@Component
@Profile("APPIUM")
public class AppiumRegistrationSteps implements IRegistrationSteps {
    @Autowired
    HomePageAppium homePageAppium;
    @Autowired
    RegistrationPageAppium registrationPageAppium;

    @Override
    public void goToMenu() {

       // WaitUtils.explicitWait(homePageAppium.getWebDriver(), ExpectedConditions.visibilityOf(homePageAppium.getMore()));
        homePageAppium.getMore().click();

    }

    @Override
    public void goToRegistrationPage() {
        WaitUtils.explicitWait(homePageAppium.getWebDriver(), ExpectedConditions.elementToBeClickable(homePageAppium.getRegistr()));
        homePageAppium.getRegistr().click();
    }

    @Override
    public void setFirstName(String value) {
        WaitUtils.explicitWait(registrationPageAppium.getWebDriver(), ExpectedConditions.elementToBeClickable(registrationPageAppium.getFirstName()));
        registrationPageAppium.getFirstName().sendKeys(value);
    }

    @Override
    public void setLastName(String value) {
        registrationPageAppium.getLastName().sendKeys(value);
    }

    @Override
    public void setEmailOrPhone(String value) {
        registrationPageAppium.getTelephoneOrEmail().sendKeys(value);
    }


    @Override
    public void setPasswd(String value) {
        registrationPageAppium.getPassword().sendKeys(value);
    }

    @Override
    public void clickSubmit() {
        registrationPageAppium.getSubmit().click();
    }

    @Override
    public String getAnwser() {
        //return registrationPageAppium.getPassword().toString();
        return "dssdds";
    }
}
