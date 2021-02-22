package Enum;
import packageWithBeans.Pages.BasePage;
import packageWithBeans.Pages.HomePage;
import packageWithBeans.Pages.RegistrationPage;

public enum Pages {
    HOME(HomePage.class),
    REGISTRATION(RegistrationPage.class);

    private Class<? extends BasePage> clazz;

    Pages(Class<? extends BasePage> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends BasePage> getClazz() {
        return clazz;
    }

    public static Pages byType(Class<? extends BasePage> clz) {
        for (Pages item : Pages.values()) {
            if (item.getClazz().getSimpleName().equalsIgnoreCase(clz.getSimpleName())) {
                return item;
            } else {
                continue;
            }
        }
        return null;
    }
}