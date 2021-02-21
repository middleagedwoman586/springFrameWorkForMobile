package Pages.impl;

import Pages.pages.RegistrationPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class RegistrationPageImpl {
    @Autowired
    RegistrationPage registrationPage;

//    public void setFirstNameApp(String name) {
//        registrationPage= new RegistrationPage();
//        registrationPage.getFirstName().sendKeys(name);
//    }
//
//    public void setLastNameApp(String last) {
//        registrationPage.getLastName().sendKeys(last);
//    }
//
//    @Profile("APPIUM")
//    public void setPhoneOrEmail(String value) {
//        registrationPage.getTelephoneOrEmail().sendKeys(value);
//    }
//
//    public void setPasswd(String passwd) {
//        registrationPage.getPassword().sendKeys(passwd);
//    }
//
//    public void submit() {
//        registrationPage.getSubmit().click();
//    }
//    public String getErrorMessage(){
//        return registrationPage.getError().getText();
//    }

    //============================================================
    public void setFirstName(String name) {
        registrationPage.getFirstNameInput().sendKeys(name);
    }

    public void setLastName(String name) {
        registrationPage.getLastNameInput().sendKeys(name);
    }

    public void setEmail(String email) {
        registrationPage.getEmailInput().sendKeys(email);
    }

    public void setPhone(String phone) {
        registrationPage.getPhoneInput().sendKeys(phone);
    }

    public void setPassword(String passwd) {
        registrationPage.getPasswordInput().sendKeys(passwd);
    }

    public void clickSubmit() {
        registrationPage.getSubmitButton().click();
    }
}
