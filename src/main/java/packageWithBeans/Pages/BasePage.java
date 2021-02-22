package packageWithBeans.Pages;

import Config.WaitConfig;
import Config.WebDriverConfig;
import Utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public abstract class BasePage {
    public abstract String getUrl();
    String module="dsd";
    WebDriver driver;
    AppiumDriver<MobileElement> driver1;

    public BasePage() {
        WaitConfig waitConfig = new WaitConfig.Builder()
                .setDefaultImplicitTimeUnit(TimeUnit.SECONDS)
                .setDefaultImplicitTimeout(10)
                .setDefaultExplicitTimeout(10)
                .build();
        WaitUtils.setWaitConfig(waitConfig);
        switch (getDriverName()){
            case ("appium"):
                PageFactory.initElements(new AppiumFieldDecorator(getWebDriver()), this);
                break;
            case ("chrome"):
                PageFactory.initElements(getWebDriver(), this);
                break;
            default:
                throw new IllegalStateException("This browser isn't supported!");

            }
        }



    public BasePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    public BasePage(AppiumDriver<MobileElement> driver1){
        this.driver1=driver1;
        PageFactory.initElements(new AppiumFieldDecorator(driver1), this);
    }

    public WebDriver getWebDriver() {
        return WebDriverConfig.getDriverInstance();
    }
    public String getDriverName(){
        return WebDriverConfig.getDriverName();
    }

    public BasePage open() {
        getWebDriver().get(getUrl());
        return this;
    }

}