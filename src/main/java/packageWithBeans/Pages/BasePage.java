package packageWithBeans.Pages;

import Config.WaitConfig;
import Config.WebDriverConfig;
import Utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.concurrent.TimeUnit;




public abstract class BasePage implements BeanPostProcessor {

    public abstract String getUrl();
    String module="dsd";
    WebDriver driver;

    public BasePage() {
        WaitConfig waitConfig = new WaitConfig.Builder()
                .setDefaultImplicitTimeUnit(TimeUnit.SECONDS)
                .setDefaultImplicitTimeout(10)
                .setDefaultExplicitTimeout(10)
                .build();
        WaitUtils.setWaitConfig(waitConfig);

        }

    public WebDriver getWebDriver() {
        return WebDriverConfig.getDriverInstance();
    }


    public BasePage open() {
        getWebDriver().get(getUrl());
        return this;
    }

}