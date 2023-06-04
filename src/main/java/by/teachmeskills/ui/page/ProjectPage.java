package by.teachmeskills.ui.page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class ProjectPage extends BasePage{

    public ProjectPage checkCreatedProject() {
        $x("//span[text()='Create new suite']").shouldBe(Condition.visible, Condition.enabled);
        return page(ProjectPage.class);
    }

    public ProjectsPage deleteProject() {
        $x("//a[text()='Projects']").shouldBe(Condition.visible, Condition.enabled).click();
        $x("//a[@class='btn btn-dropdown']").shouldBe(Condition.visible, Condition.enabled).click();
        $x("//button[text()='Delete']").shouldBe(Condition.visible, Condition.enabled).click();
        $x("//span[text()='Delete project']").shouldBe(Condition.visible, Condition.enabled).click();
        $x("//div[text()='Looks like you don’t have any projects yet.']").shouldBe(Condition.visible);
        return page(ProjectsPage.class);
    }
}
