package by.teachmeskills.ui.page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class BasePage {

    public LoginPage singOut() {
       $x("/html/body/div[1]/div/div[1]/div[2]/span[3]/img")
               .shouldBe(Condition.visible, Condition.enabled)
               .click();
       $x("//span[text()='Sign out']")
               .shouldBe(Condition.visible, Condition.enabled)
               .click();
return page(LoginPage.class);
    }
}
