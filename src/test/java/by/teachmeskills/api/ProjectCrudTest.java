package by.teachmeskills.api;

import by.teachmeskills.api.client.ProjectApiClient;
import by.teachmeskills.api.dto.project.GetProjectResponse;
import org.testng.annotations.Test;

public class ProjectCrudTest {

    @Test
    public void getProject() {
        GetProjectResponse demo = new ProjectApiClient().getProject("DEMO");
    }
}