package Utils;

import Config.WaitConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class WaitUtils {
    private static WaitConfig waitConfig;

    public WaitUtils(WaitConfig waitConfig) {
        this.waitConfig = waitConfig;
    }

    public static void setWaitConfig(WaitConfig waitConfiguration) {
        waitConfig = waitConfiguration;
    }

    public static void implicitWait(WebDriver driver) {
        driver.manage()
                .timeouts()
                .implicitlyWait(waitConfig.getDefaultImplicitTimeout(), waitConfig.getDefaultImplicitTimeUnit());

    }

    public static void waitForPageLoad(WebDriver driver) {
        driver.manage()
                .timeouts()
                .pageLoadTimeout(waitConfig.getDefaultExplicitTimeout(), waitConfig.getDefaultImplicitTimeUnit());
    }

    public static void fluentWait(WebDriver driver) {
        FluentWait<WebDriver> fluentWait = new WebDriverWait(driver, 60)
                .pollingEvery(Duration.ofMillis(2000)).ignoring(Exception.class);
    }

    public static void waitForLoad(WebDriver driver) {
        new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").toString().equals("complete"));
    }



    public static <V> void explicitWait(WebDriver driver, Function<? super WebDriver, V> condition) {
        WebDriverWait wait = new WebDriverWait(driver, waitConfig.getDefaultExplicitTimeout());
        wait.until(condition);
    }
}