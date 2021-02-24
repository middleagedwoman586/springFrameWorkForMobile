
import config.BeanConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import packageWithBeans.steps.IRegistrationSteps;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
@ActiveProfiles("APPIUM")
public class RegistrationTest extends BaseTest {

    @Autowired
    IRegistrationSteps iRegistrationSteps;



    @Test
    public void register() {
        final String errorMessage = "Пароль має бути не менше 6 символів";

        iRegistrationSteps.goToMenu();
        iRegistrationSteps.goToRegistrationPage();
        iRegistrationSteps.setFirstName("ddd");
        iRegistrationSteps.setLastName("sss");
        iRegistrationSteps.setEmailOrPhone("dsds");
        iRegistrationSteps.setPasswd("QWE");
        iRegistrationSteps.clickSubmit();


        Assert.assertEquals(iRegistrationSteps.getAnwser(),errorMessage);


    }
}
