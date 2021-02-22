package Config;

import Enum.SupportedDrivers;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class WebDriverConfig {
    private static WebDriver driverInstance;
    private static String driverName;
    private WebDriverConfig() {

    }

    public static WebDriver setWebDriver(SupportedDrivers driver) throws MalformedURLException {
        if (driverInstance != null) return driverInstance;
        driverName = driver.getDeviceName();

        switch (driverName) {
            case ("chrome"): {
                System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
                Map<String, String> mobileEmulation = new HashMap<>();
                mobileEmulation.put("deviceName", "Pixel 2");
                mobileEmulation.put("platformName", "Android");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                WebDriverManager.chromedriver().setup();
                driverInstance = new ChromeDriver(chromeOptions);
                return driverInstance;
            }
            case ("appium"): {
                File app = new File("src\\main\\resources\\Rozetka.apk");
                DesiredCapabilities capability = new DesiredCapabilities();
                capability.setCapability("platformName", Platform.ANDROID);
                capability.setCapability("platformVersion", "11");
                capability.setCapability("udid", "emulator-5554");
                capability.setCapability("app", app.getAbsolutePath());
                capability.setCapability("automationName", "appium");
                driverInstance = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
                return driverInstance;
            }
            default: {
                throw new IllegalStateException("This browser isn't supported!");
            }
        }

    }

    public static WebDriver getDriverInstance() {
        return driverInstance;
    }
    public static String getDriverName(){
       return driverName;
    }


    public static void tearDown() {
        if (driverInstance != null) {
            driverInstance.quit();
            driverInstance = null;
        }
    }
}


