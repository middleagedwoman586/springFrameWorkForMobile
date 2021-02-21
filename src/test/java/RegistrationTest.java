import Flow.AppiumRegistrationSteps;
import Flow.IRegistrationSteps;
import Flow.WebRegistrationSteps;
import Pages.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ActiveProfiles("WEB")
public class RegistrationTest extends BaseTest {
    @Autowired
    IRegistrationSteps iRegistrationSteps;
    @Autowired
    WebRegistrationSteps webRegistrationSteps;
    //  @Autowired
//    AppiumRegistrationSteps appiumRegistrationSteps;
    @Autowired
    HomePage homePage;

    @Test
    public void checkProfile() {
        System.out.println("dsdsd");
        Assert.assertTrue(iRegistrationSteps instanceof WebRegistrationSteps);
    }

    @Test
    public void register() throws InterruptedException {
        final String errorMessage = "Пароль має бути не менше 6 символів";
//        appiumRegistrationSteps = new AppiumRegistrationSteps();
//        appiumRegistrationSteps.goToMenu();
//        appiumRegistrationSteps.setFirstName("sd");
//        appiumRegistrationSteps.setLastName("sdf");

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
