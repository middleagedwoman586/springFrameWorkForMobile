package packageWithBeans.pages;

import config.IConfig;
import config.WaitConfig;
import utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public abstract class BasePage {

    private static final String URL="https://rozetka.com.ua/ua/";
    private WebDriver driver;

    public BasePage(IConfig<WebDriver> config) {
        WaitConfig waitConfig = new WaitConfig.Builder()
                .setDefaultImplicitTimeUnit(TimeUnit.SECONDS)
                .setDefaultImplicitTimeout(10)
                .setDefaultExplicitTimeout(10)
                .build();
        WaitUtils.setWaitConfig(waitConfig);
        this.driver = config.getDriver();
        this.driver.get(URL);
        PageFactory.initElements(this.driver, this);
    }

    public WebDriver getWebDriver() {
        return driver;
    }




}