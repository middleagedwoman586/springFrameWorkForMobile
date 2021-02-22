import Config.BeanConfig;
//import packageWithBeans.Flow.AppiumRegistrationSteps;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import packageWithBeans.Flow.AppiumRegistrationSteps;


public class mainforbeans {


    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        AppiumRegistrationSteps d = ctx.getBean(AppiumRegistrationSteps.class);
        System.out.println(d.getAnwser());
    }
}
