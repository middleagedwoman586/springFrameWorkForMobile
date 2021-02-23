import Config.BeanConfig;
//import packageWithBeans.Flow.AppiumRegistrationSteps;
import Config.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.NullValueInNestedPathException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import packageWithBeans.Flow.AppiumRegistrationSteps;
import packageWithBeans.Flow.WebRegistrationSteps;
import packageWithBeans.Pages.HomePage;
import packageWithBeans.Pages.HomePageAppium;
import packageWithBeans.Pages.RegistrationPage;
import packageWithBeans.Pages.RegistrationPageAppium;


public class mainforbeans {

    public static void main(String[] args) {

            ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
            WebDriver d = ctx.getBean(WebDriver.class);
            System.out.println(d.toString());
            System.out.println("sdsdsd");

    }
}
