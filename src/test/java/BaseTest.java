import Config.WebDriverConfig;
import Utils.PageStorage;
import Enum.SupportedDrivers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;

@RunWith(JUnit4.class)
@ContextConfiguration
public class BaseTest {

    protected WebDriver webDriver;

    @Before
    public void initDriver() throws MalformedURLException {

        webDriver = WebDriverConfig.setWebDriver(SupportedDrivers.CHROME);
    }

    @After
    public void tearDown() {

        WebDriverConfig.tearDown();
    }

}