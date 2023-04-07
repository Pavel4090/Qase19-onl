package by.teachmeskills.ui.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ProjectsPage extends BasePage{

    String NAME_OF_PROJECT = "Qase_Demo_Project";

    public ProjectPage createNewProject() {
        $x("//span[text()='Create new project']").shouldBe(Condition.visible, Condition.enabled)
                                                 .click();  //Button for create
        $(By.id("project-name")).shouldBe(Condition.visible, Condition.enabled)
                                .sendKeys(NAME_OF_PROJECT);
        $x("//input[@value='public']").click(); //make project 'public'
        $x("//span[text()='Create project']").click(); //Button to create
    return page(ProjectPage.class);
    }

    public LoginPage open() {
        Selenide.open("/login");
        getWebDriver().manage().window().maximize();
        return page(LoginPage.class);
    }
}
