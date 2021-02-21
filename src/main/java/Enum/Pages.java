package Enum;
import Pages.pages.BasePage;
import Pages.pages.HomePage;
import Pages.pages.RegistrationPage;

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