package by.teachmeskills.ui;

import by.teachmeskills.ui.page.ProjectsPage;
import org.testng.annotations.Test;

public class CreateProjectTest {

    @Test
    public void createNewPublicProject() {
        new ProjectsPage().open()
                          .loginAsValidUser()
                          .createNewProject()
                          .checkCreatedProject()
                          .deleteProject();
    }

}
