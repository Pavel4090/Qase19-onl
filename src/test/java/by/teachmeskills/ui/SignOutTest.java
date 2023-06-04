package by.teachmeskills.ui;

import by.teachmeskills.ui.page.LoginPage;
import org.testng.annotations.Test;

public class SignOutTest {

    @Test
    public void signOutTest() {
        new LoginPage().open()
                       .loginAsValidUser()
                       .createNewProject()
                       .checkCreatedProject()
                       .deleteProject()
                       .singOut();
    }
}
