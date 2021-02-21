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

import java.net.MalformedURLException;

@RunWith(JUnit4.class)
public class BaseTest {

    protected WebDriver webDriver;

//    @Before
//    public void initDriver() throws MalformedURLException {
//        webDriver = WebDriverConfig.setWebDriver(SupportedDrivers.APPIUM);
//
//    }

    @After
    public void tearDown() {
//        WebDriverConfig.clearCookies();
//        WebDriverConfig.tearDown();
    }

}