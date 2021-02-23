import Config.BeanConfig;
import Config.BeanConfigTest;
import Config.WebDriverConfig;
import Enum.SupportedDrivers;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.net.MalformedURLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class,BeanConfigTest.class})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
@ActiveProfiles("APPIUM")
public class BaseTest {



    @Bean
    @Profile("APPIUM")
    @Before
    public void initDriver() throws MalformedURLException {
        WebDriverConfig.setWebDriver(SupportedDrivers.APPIUM);

    }

    @Bean
    @Profile("WEB")
    public void initDriverWeb() throws MalformedURLException {
        WebDriverConfig.setWebDriver(SupportedDrivers.CHROME);
    }


    @After
    public void tearDown() {

        WebDriverConfig.tearDown();
    }

}