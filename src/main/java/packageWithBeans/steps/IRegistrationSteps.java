package packageWithBeans.steps;


public interface IRegistrationSteps {
    void goToMenu();
    void goToRegistrationPage();
    void setFirstName(String value);
    void setLastName(String value);
    void setEmailOrPhone(String value);
    void setPasswd(String value);
    void clickSubmit();
    String getAnwser();
}
