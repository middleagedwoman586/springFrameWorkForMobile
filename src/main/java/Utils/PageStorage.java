package Utils;

import packageWithBeans.Pages.BasePage;
import packageWithBeans.Pages.HomePage;
import Enum.Pages;
import packageWithBeans.Pages.RegistrationPage;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class PageStorage {
    Map<Pages, BasePage> pages = new HashMap<>();

    public PageStorage() {
        pages.put(Pages.HOME, new HomePage());
        pages.put(Pages.REGISTRATION, new RegistrationPage());
    }

    public <T extends BasePage> T getPage(Class<T> clazz) {
        Pages page = Pages.byType(clazz);
        return clazz.cast(pages.get(page));
    }
}
