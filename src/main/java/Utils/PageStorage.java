package Utils;

import Pages.pages.BasePage;
import Pages.pages.HomePage;
import Enum.Pages;
import Pages.pages.RegistrationPage;
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
