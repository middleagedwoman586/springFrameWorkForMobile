import Config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    ApplicationContext context;


    @Test
    public void register()  {
        final String errorMessage = "Пароль має бути не менше 6 символів";

        iRegistrationSteps.goToMenu();
        iRegistrationSteps.goToRegistrationPage();
        iRegistrationSteps.setFirstName("ddd");
        iRegistrationSteps.setLastName("sss");
        iRegistrationSteps.setEmailOrPhone("dsds");
        iRegistrationSteps.setPasswd("QWE");
        iRegistrationSteps.clickSubmit();


//        Assert.assertEquals(registrationPage.getErrorMessage(),errorMessage);


    }
}
