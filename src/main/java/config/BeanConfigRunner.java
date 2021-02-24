package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import packageWithBeans.Flow.AppiumRegistrationSteps;

//@SpringBootApplication
public class BeanConfigRunner {
private static ApplicationContext applicationContext;
    public static void main(String[] args) {
//
            ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
            WebConfig d = ctx.getBean(WebConfig.class);


//            applicationContext=SpringApplication.run(BeanConfig.class, args);

    }
}
