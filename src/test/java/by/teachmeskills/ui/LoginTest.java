package by.teachmeskills.ui;


import by.teachmeskills.ui.page.LoginPage;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginAsValidUser() {
        new LoginPage().open()
                       .loginAsValidUser();
    }

    @Test
    public void loginWithInvalidPassword() {
        new LoginPage().open()
                       .loginWithInvalidPassword();
    }
}