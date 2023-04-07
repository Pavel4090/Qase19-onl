package by.teachmeskills.ui.page;


import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.By.id;

public class LoginPage {

    public LoginPage open() {
        Selenide.open("/login");
        getWebDriver().manage().window().maximize();
        return this;
    }

    public ProjectsPage loginAsValidUser() {
        $(id("inputEmail")).shouldBe(visible, enabled)
                           .sendKeys("pavelcurikov090@gmail.com");
        $(id("inputPassword")).shouldBe(visible, enabled)
                              .sendKeys("SkHWXd8FKc7S5WQ");
        $(id("btnLogin")).shouldBe(enabled)
                         .click();
        return page(ProjectsPage.class);
    }

    public LoginPage loginWithInvalidPassword() {
        $(id("inputEmail")).shouldBe(visible, enabled)
                           .sendKeys("pavelcurikov090@gmail.com");
        $(id("inputPassword")).shouldBe(visible, enabled)
                              .sendKeys("abcdefg");
        $(id("btnLogin")).shouldBe(enabled)
                         .click();
        $x("//div[text()='These credentials do not match our records.']").shouldBe(visible);
        return this;
    }
}