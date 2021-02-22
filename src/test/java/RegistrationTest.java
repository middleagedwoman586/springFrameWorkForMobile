import packageWithBeans.Flow.AppiumRegistrationSteps;
import packageWithBeans.Flow.IRegistrationSteps;
import packageWithBeans.Flow.WebRegistrationSteps;
import packageWithBeans.Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("WEB")
public class RegistrationTest extends BaseTest {
    @Autowired
    IRegistrationSteps iRegistrationSteps;
    @Autowired
    WebRegistrationSteps webRegistrationSteps;
    @Autowired
    AppiumRegistrationSteps appiumRegistrationSteps;
    @Autowired
    HomePage homePage;

    @Test
    public void checkIf() {
    String exp= "Web";

    Assert.assertEquals(appiumRegistrationSteps.getAnwser(), exp);
    }

    @Test
    public void register() throws InterruptedException {
        final String errorMessage = "Пароль має бути не менше 6 символів";
//        appiumRegistrationSteps = new AppiumRegistrationSteps();
//        appiumRegistrationSteps.goToMenu();
//        appiumRegistrationSteps.goToRegistrationPage();
//        appiumRegistrationSteps.setFirstName("sd");
//        appiumRegistrationSteps.setLastName("sdf");
//
        webRegistrationSteps = new WebRegistrationSteps();
        webRegistrationSteps.goToMenu();
        webRegistrationSteps.goToRegistrationPage();
        webRegistrationSteps.setFirstName("sddsd");
        webRegistrationSteps.setLastName("dfgg");

//        iRegistrationSteps.goToMenu();
//        iRegistrationSteps.setFirstName("ddd");
//        iRegistrationSteps.setLastName("sss");


//        Assert.assertEquals(registrationPage.getErrorMessage(),errorMessage);


    }
}
